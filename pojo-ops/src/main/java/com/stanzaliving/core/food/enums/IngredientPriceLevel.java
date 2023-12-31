package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum IngredientPriceLevel {
	COUNTRY("Country"),
	CITY("City"),
	VENDOR("Vendor");

	private String priceLevel;

}
