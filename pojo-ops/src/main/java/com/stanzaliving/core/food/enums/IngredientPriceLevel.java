package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IngredientPriceLevel {
	COUNTRY("Country"),
	CITY("City"),
	VENDOR("Vendor");

	private final String priceLevel;

}
