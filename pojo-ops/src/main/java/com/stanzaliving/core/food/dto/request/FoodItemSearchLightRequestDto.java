package com.stanzaliving.core.food.dto.request;

import java.util.Collection;

import com.stanzaliving.core.food.enums.FoodItemType;
import com.stanzaliving.core.food.enums.RecipeType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author manish.pareek
 *
 * @since 30-AUG-2021
 *
 * @version 1.0
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemSearchLightRequestDto {
	private String name;
	private FoodItemType itemType;
	private Boolean dataComplete;
	private Collection<RecipeType> recipeType;

}
