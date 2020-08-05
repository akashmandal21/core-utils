package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RecipeType {
	FINISHED_DISH ("Finished Dish"),
	SEMI_PROCESSED ("Semi Processed"),
	DIRECT_SALE ("Direct Sale");

	private final String recipeName;
}
