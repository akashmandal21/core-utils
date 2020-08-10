package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum FoodItemType {

	VEG("Veg"),
	NON_VEG("Non-Veg"),
	SPECIAL_VEG("Special-Veg");

	private String itemType;

	private static Map<String, FoodItemType> foodItemTypeMap = new HashMap<>();

	static {
		for (FoodItemType foodItemType : FoodItemType.values()) {
			foodItemTypeMap.put(foodItemType.getItemType(), foodItemType);
		}
	}

	public static Map<String, FoodItemType> getFoodItemTypeNameMap() {
		return foodItemTypeMap;
	}

}