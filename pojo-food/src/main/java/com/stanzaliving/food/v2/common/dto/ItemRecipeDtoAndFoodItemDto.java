package com.stanzaliving.food.v2.common.dto;

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
public class ItemRecipeDtoAndFoodItemDto {

	private ItemRecipeDto itemRecipe; 
	private String itemId;
}
