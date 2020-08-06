package com.stanzaliving.core.food.enums;

import com.stanzaliving.core.base.common.dto.ListingDto;
import lombok.AllArgsConstructor;
import lombok.Getter;


import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum RecipeType {
	FINISHED_DISH ("Finished Dish"),
	SEMI_PROCESSED ("Semi Processed"),
	DIRECT_SALE ("Direct Sale");

	private final String typeName;

	private static List<ListingDto> recipeList = new ArrayList<>();

	static {

		for (RecipeType recipeType : RecipeType.values()) {
			recipeList.add(ListingDto.builder().id(recipeType.name()).name(recipeType.getTypeName()).build());
		}
	}

	public static List<ListingDto> getRecipeListing() {
		return recipeList;
	}
}
