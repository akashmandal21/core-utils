package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum IngredientType {

	RAW_INGREDIENT("Raw Ingredient"),
	SEMI_PROCESSED("Processed Ingredient"),
	DIRECT_SALE("Direct Sale");

	private String typeName;

	private static Map<String, IngredientType> ingredientsTypeByStr = new HashMap<>();

	static {
		for (IngredientType ingredientType: IngredientType.values()) {
			ingredientsTypeByStr.put(ingredientType.name(), ingredientType);
		}
	}

	public static IngredientType getIngredientsByStr(String ingredientsStr) {
		return ingredientsTypeByStr.get(ingredientsStr);
	}
}