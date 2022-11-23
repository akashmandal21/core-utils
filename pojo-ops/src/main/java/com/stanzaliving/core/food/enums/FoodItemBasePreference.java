package com.stanzaliving.core.food.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.stanzaliving.core.user.enums.EnumListing;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 12-June-2020
 *
 */

@Getter
@AllArgsConstructor
public enum FoodItemBasePreference {

	BALANCED("Balanced", "Regular Thali"),
	RICE_BASE("Rice Base", "Rice Thali"),
	ROTI_BASE("Roti Base", "Roti Thali"),
	COMBO("Combo", "Combo");

	private String basePreference;
	private String label;

	private static Map<FoodRegion, List<EnumListing<FoodItemBasePreference>>> preferencesByRegionMap = new HashMap<>();

	private static List<EnumListing<FoodItemBasePreference>> enumListings = new ArrayList<>();

	static {

		for (FoodItemBasePreference foodItemBasePreference : FoodItemBasePreference.values()) {
			enumListings.add(EnumListing.of(foodItemBasePreference, foodItemBasePreference.getBasePreference()));
		}

		preferencesByRegionMap.put(FoodRegion.NORTH, enumListings);
		preferencesByRegionMap.put(FoodRegion.SOUTH, Arrays.asList(EnumListing.of(RICE_BASE, RICE_BASE.getBasePreference()), EnumListing.of(COMBO, COMBO.getBasePreference())));
		preferencesByRegionMap.put(FoodRegion.CONTINENTAL, Arrays.asList(EnumListing.of(COMBO, COMBO.getBasePreference())));
		preferencesByRegionMap.put(FoodRegion.MIX, Arrays.asList(EnumListing.of(BALANCED, BALANCED.getBasePreference())));
		preferencesByRegionMap.put(FoodRegion.INDIAN, Arrays.asList(EnumListing.of(COMBO, COMBO.getBasePreference())));

	}

	public static List<EnumListing<FoodItemBasePreference>> getBasePreferenceListing() {
		return enumListings;
	}

	public static List<FoodItemBasePreference> getFoodItemBasePreferenceListFromCSV(String csvString) {

		List<FoodItemBasePreference> foodItemBasePreferences = new ArrayList<>();

		if (StringUtils.isNotBlank(csvString)) {

			String[] splitString = csvString.split(",");

			for (String string : splitString) {

				if (FoodItemBasePreference.valueOf(string) != null) {
					foodItemBasePreferences.add(FoodItemBasePreference.valueOf(string));
				}

			}

		}

		return foodItemBasePreferences;
	}

	public static List<EnumListing<FoodItemBasePreference>> getPreferencesForRegion(FoodRegion foodRegion) {
		return preferencesByRegionMap.getOrDefault(foodRegion, new ArrayList<>());
	}

	public static Map<FoodRegion, List<EnumListing<FoodItemBasePreference>>> getPreferenceByRegionMap() {
		return preferencesByRegionMap;
	}

}