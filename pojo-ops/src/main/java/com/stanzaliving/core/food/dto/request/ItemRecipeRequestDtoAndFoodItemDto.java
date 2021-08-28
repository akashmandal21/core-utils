package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.food.dto.FoodItemDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 * @version 1.0
 *
 * @since 28-AUG-2021
 */


@Getter
@Setter
@ToString
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ItemRecipeRequestDtoAndFoodItemDto {

	private ItemRecipeRequestDto recipeRequestDto;
	private FoodItemDto foodItem;
}
