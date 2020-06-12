package com.stanzaliving.core.food.enums;

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
public enum  FoodItemBasePreference {
	REGULAR("Regular"),
	RICE_BASE("Rice Base"),
	ROTI_BASE("Roti Base");

	private String basePreference;
}
