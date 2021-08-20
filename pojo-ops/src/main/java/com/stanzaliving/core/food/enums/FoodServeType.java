package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum FoodServeType {

	PACKAGED("Packaged", "Boxed"),
	NON_PACKAGED("Non-Packaged", "Buffet");

	private String serveTypeName;
	private String commonName;

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