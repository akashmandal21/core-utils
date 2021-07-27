package com.stanzaliving.food.v2.common.dto;

import com.stanzaliving.core.operations.enums.MealType;
import com.stanzaliving.food.entity.FoodItem;
import com.stanzaliving.food.entity.ItemRecipe;
import com.stanzaliving.food.entity.ItemRecipeIngredients;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Set;

/**
 * @author piyush.srivastava
 *
 * @date 08-Aug-2020
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemCsvCompleteDto {
	private FoodItem foodItem;

	private List<MealType> meals;

	private Set<String> tagIds;

	private ItemRecipe itemRecipe;

	private List<ItemRecipeIngredients> recipeIngredients;
}
