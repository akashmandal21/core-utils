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

	private static Map<String, FoodItemType> foodItemTypeNameMap = new HashMap<>();

	private static Map<String, FoodItemType> foodItemTypeMap = new HashMap<>();

	static {
		for (FoodItemType foodItemType : FoodItemType.values()) {
			foodItemTypeNameMap.put(foodItemType.getItemType(), foodItemType);

			foodItemTypeMap.put(foodItemType.name(), foodItemType);
		}
	}

	public static Map<String, FoodItemType> getFoodItemTypeNameMap() {
		return foodItemTypeNameMap;
	}

	public static FoodItemType getFoodItemByName(String typeName) {
		return foodItemTypeNameMap.get(typeName);
	}

	public static FoodItemType getFoodItemByType(String itemType) {
		return foodItemTypeMap.get(itemType);
	}

}