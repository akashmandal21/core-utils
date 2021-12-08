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
public enum GovtIdType {

	PAN_CARD("Pan Card", 1), 
	DRIVING_LICENSE("Driving License", 2), 
	AADHAR_CARD("Aadhar Card", 3);

	private String govtIdName;
	private Integer govtId;

	private static final List<EnumListing<GovtIdType>> enumListing = new ArrayList<>();
	private static Map<String, GovtIdType> govtIdTypeMap = new HashMap<>();

	static {
		for (GovtIdType govtIdType : GovtIdType.values()) {
			enumListing.add(EnumListing.of(govtIdType, govtIdType.getGovtIdName()));
			govtIdTypeMap.put(govtIdType.getGovtIdName(), govtIdType);
		}
	}

	public static GovtIdType getGovtIdType(String type) {
		return govtIdTypeMap.get(type);
	}

	public static List<EnumListing<GovtIdType>> getGovtIdTypeListing() {
		return enumListing;
	}

}
