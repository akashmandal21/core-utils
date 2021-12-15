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
public enum ProviderMappingStatus {

	NEW("New", 1), 
	EXISTING("Existing", 2);
	

	private String providerMappingStatusName;
	private Integer providerMappingStatusId;

	private static final List<EnumListing<ProviderMappingStatus>> enumListing = new ArrayList<>();
	private static Map<String, ProviderMappingStatus> providerMappingStatusIdTypeMap = new HashMap<>();

	static {
		for (ProviderMappingStatus providerMappingStatus : ProviderMappingStatus.values()) {
			enumListing.add(EnumListing.of(providerMappingStatus, providerMappingStatus.getProviderMappingStatusName()));
			providerMappingStatusIdTypeMap.put(providerMappingStatus.getProviderMappingStatusName(), providerMappingStatus);
		}
	}

	public static ProviderMappingStatus getServiceProviderMappingActionType(String type) {
		return providerMappingStatusIdTypeMap.get(type);
	}

	public static List<EnumListing<ProviderMappingStatus>> getServiceProviderMappingActionTypeListing() {
		return enumListing;
	}

}
