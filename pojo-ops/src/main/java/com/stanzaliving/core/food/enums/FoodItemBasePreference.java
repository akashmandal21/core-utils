package com.stanzaliving.core.food.enums;

import java.util.HashMap;
import java.util.Map;

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

	REGULAR("Regular"),
	RICE_BASE("Rice Base"),
	ROTI_BASE("Roti Base");

	private String basePreference;

	private static Map<String, FoodItemBasePreference> preferenceMapByName = new HashMap<>();

	static {

		for (FoodItemBasePreference basePreference : FoodItemBasePreference.values()) {
			preferenceMapByName.put(basePreference.getBasePreference(), basePreference);
		}

	}

	public static FoodItemBasePreference getPreferenceByName(String basePreference) {
		return preferenceMapByName.get(basePreference);
	}
}
