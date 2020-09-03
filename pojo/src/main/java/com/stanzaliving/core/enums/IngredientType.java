package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IngredientType {

	RAW_INGREDIENT("Raw Ingredient"),
	PROCESSED_INGREDIENT("Processed Ingredient");

	private String typeName;

}