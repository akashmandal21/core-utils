package com.stanzaliving.core.food.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Manish Pareek "manishpareek.retainer@stanzaliving.com"
 *
 * @date 11-Jan-2021
 *
 */

@Getter
@AllArgsConstructor
public enum RegionAndFoodItemBasePreference {

	NORTH_BALANCED("NORTH_BALANCED","Balanced", "North Regular Thali", 1),
	NORTH_ROTI_BASE("NORTH_ROTI_BASE","Roti Base", "North Roti Thali", 2),
	NORTH_RICE_BASE("NORTH_RICE_BASE","Rice Base", "North Rice Thali", 3),
	SOUTH_RICE_BASE("SOUTH_RICE_BASE","Rice Base", "South Rice Thali", 4),
	CONTINENTAL_COMBO("CONTINENTAL_COMBO","Combo", "Continental Combo", 5),
	NORTH_COMBO("NORTH_COMBO","Combo", "North Combo", 6),
	SOUTH_COMBO("SOUTH_COMBO","Combo", "South Combo", 7),
	INDIAN_COMBO("INDIAN_COMBO","Combo", "Indian Combo", 8);

	private String regionAndBasePreference;
	private String basePreference;
	private String label;
	private Integer sequence;
	
	
	private static List<RegionAndFoodItemBasePreference> enumListings = new ArrayList<>();

	static {
		for (RegionAndFoodItemBasePreference regionAndBasePreference : RegionAndFoodItemBasePreference.values()) {
			enumListings.add(regionAndBasePreference);
		}
	}

	public static List<RegionAndFoodItemBasePreference> getRegionAndFoodItemBasePreferenceListing() {
		return enumListings;
	}
}