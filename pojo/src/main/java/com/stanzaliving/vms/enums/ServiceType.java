package com.stanzaliving.vms.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ServiceType {

    FOOD("Food", 1),
    HOUSEKEEPING("Housekeeping", 2),
    SECURITY("Security", 3),
	LAUNDRY("Laundry", 4),
    GYMNASIUM("Gymnasium", 5);

	private String serviceTypeName;
	private Integer serviceId;

	private static final List<EnumListing<ServiceType>> enumListing = new ArrayList<>();
	private static Map<String, ServiceType> serviceTypeMap = new HashMap<>();

	static {
		for (ServiceType curServiceType : ServiceType.values()) {
			enumListing.add(EnumListing.of(curServiceType, curServiceType.getServiceTypeName()));
			serviceTypeMap.put(curServiceType.getServiceTypeName(), curServiceType);
		}
	}

	public static ServiceType getServiceType(String type) {
		return serviceTypeMap.get(type);
	}
	
}
