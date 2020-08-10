package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IngredientType {

	INGREDIENT("Ingredient"),
	PROCESSED_INGREDIENT("Processed Ingredient");

	private String typeName;

}