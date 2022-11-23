package com.stanzaliving.core.food.enums;

import java.util.ArrayList;
import java.util.List;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.Getter;

@Getter
public enum MenuCategoryType {

	B2C,
	B2B;

	private static List<EnumListing<MenuCategoryType>> enumListings = new ArrayList<>();

	static {

		for (MenuCategoryType heavynessLevel : MenuCategoryType.values()) {
			enumListings.add(EnumListing.of(heavynessLevel, heavynessLevel.name()));
		}

	}

	public static List<EnumListing<MenuCategoryType>> getListing() {
		return enumListings;
	}
}