package com.stanzaliving.core.food.enums;

import java.util.ArrayList;
import java.util.List;

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

	BALANCED("Balanced"),
	REGULAR("Regular"),
	RICE_BASE("Rice Base"),
	ROTI_BASE("Roti Base");

	private String basePreference;

	private static List<EnumListing<FoodItemBasePreference>> enumListings = new ArrayList<>();

	static {

		for (FoodItemBasePreference foodItemBasePreference : FoodItemBasePreference.values()) {
			enumListings.add(EnumListing.of(foodItemBasePreference, foodItemBasePreference.getBasePreference()));
		}

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
}