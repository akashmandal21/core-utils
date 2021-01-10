package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodPreference {

	VEG("Veg"),
	NON_VEG("Non-Veg");

	private String preferenceName;

}