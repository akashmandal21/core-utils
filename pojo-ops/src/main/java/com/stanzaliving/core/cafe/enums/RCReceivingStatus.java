package com.stanzaliving.core.cafe.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RCReceivingStatus {
    PENDING("Created"),
    RECEIVED("Received");

    private final String status;


    private static final List<EnumListing<RCReceivingStatus>> enumListing = new ArrayList<>();

	public static List<EnumListing<RCReceivingStatus>> getEnumListing() {
		return enumListing;
	}

	static {
		for (RCReceivingStatus rcStatus : RCReceivingStatus.values()) {
			EnumListing<RCReceivingStatus> listing = EnumListing.of(rcStatus, rcStatus.getStatus());
			enumListing.add(listing);
		}
	}
}
