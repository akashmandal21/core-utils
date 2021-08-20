package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum FoodServeType {

	PACKAGED("Packaged", "Boxed", 1),
	NON_PACKAGED("Non-Packaged", "Buffet", 2),
	HYBRID("Hybrid", "Hybrid", 3);

	private String serveTypeName;
	private String commonName;
	private int sequence;

	private final static List<EnumListing<FoodServeType>> enumListings = new ArrayList<>();

	static {
		for (FoodServeType curStatus : FoodServeType.values()) {
			enumListings.add(EnumListing.of(curStatus, curStatus.getServeTypeName()));
		}
	}

	public static List<EnumListing<FoodServeType>> getEnumListings() {
		return enumListings;
	}
}