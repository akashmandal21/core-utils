/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 10 Aug, 2020
 *
 **/
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DishRecipeDetailsDto {

	private int cookQuantity;

	private Double standardQuantity;

	private Integer quantityPerPax;

	private double estimatedCost;

	private List<KitchenCostDto> kitchenCostDtos;

	private List<RecipeIngredientDto> ingredients;
}