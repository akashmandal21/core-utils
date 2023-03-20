package com.stanzaliving.operations.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.Getter;

@Getter
public enum ServiceMixStatus {
	SAVED,
	SUBMITTED,
	APPROVED,
	REJECTED,
	DISCARDED,
	MERGED,
	DEACTIVATED;

	private String status;
	
	private static List<EnumListing<ServiceMixStatus>> enumListings = new ArrayList<>();

	static {
		List<ServiceMixStatus> copytoActionStatusList = Arrays.asList(ServiceMixStatus.SUBMITTED, ServiceMixStatus.APPROVED);
		for (ServiceMixStatus heavynessLevel : copytoActionStatusList) {
			enumListings.add(EnumListing.of(heavynessLevel, heavynessLevel.name()));
		}

	}

	public static List<EnumListing<ServiceMixStatus>> getCopyToActionListing() {
		return enumListings;
	}
	
}