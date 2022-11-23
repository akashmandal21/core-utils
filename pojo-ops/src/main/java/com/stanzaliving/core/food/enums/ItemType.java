package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ItemType {
	INGREDIENT_TAG("Ingredient Tag"),
	FOOD_ITEM("Food Item");

	private final String type;
}
