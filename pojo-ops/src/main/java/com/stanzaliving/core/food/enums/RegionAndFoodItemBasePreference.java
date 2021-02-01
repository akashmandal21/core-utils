package com.stanzaliving.core.food.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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

	NORTH_BALANCED("NORTH_BALANCED", "Balanced", "North Regular Thali", 1),
	NORTH_ROTI_BASE("NORTH_ROTI_BASE", "Roti Base", "North Roti Thali", 2),
	NORTH_RICE_BASE("NORTH_RICE_BASE", "Rice Base", "North Rice Thali", 3),
	SOUTH_RICE_BASE("SOUTH_RICE_BASE", "Rice Base", "South Rice Thali", 4),
	CONTINENTAL_COMBO("CONTINENTAL_COMBO", "Combo", "Continental Combo", 5),
	NORTH_COMBO("NORTH_COMBO", "Combo", "North Combo", 6),
	SOUTH_COMBO("SOUTH_COMBO", "Combo", "South Combo", 7),
	INDIAN_COMBO("INDIAN_COMBO", "Combo", "Indian Combo", 8);

	private String regionAndBasePreference;
	private String basePreference;
	private String label;
	private Integer sequence;

	private static List<RegionAndFoodItemBasePreference> enumListings = new ArrayList<>();
	private static Map<String, RegionAndFoodItemBasePreference> regionAndPreferenceCodeMap = new HashMap<>();

	static {
		for (RegionAndFoodItemBasePreference regionAndBasePreference : RegionAndFoodItemBasePreference.values()) {
			enumListings.add(regionAndBasePreference);

			regionAndPreferenceCodeMap.put(regionAndBasePreference.getRegionAndBasePreference(), regionAndBasePreference);
		}
	}

	public static List<RegionAndFoodItemBasePreference> getRegionAndFoodItemBasePreferenceListing() {
		return enumListings;
	}

	public static RegionAndFoodItemBasePreference getRegionAndFoodItemBasePreferenceValue(FoodRegion foodRegion, FoodItemBasePreference foodItemBasePreference) {

		if (Objects.nonNull(foodRegion) && Objects.nonNull(foodItemBasePreference)) {

			StringBuilder value = new StringBuilder();
			value.append(foodRegion);
			value.append("_");
			value.append(foodItemBasePreference);

			return regionAndPreferenceCodeMap.get(value.toString());
		}

		return null;
	}
}