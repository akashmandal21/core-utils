package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodItemType {

	VEG("Veg"),
	NON_VEG("Non-Veg"),
	SPECIAL_VEG("Special-Veg");

	private String itemType;

}