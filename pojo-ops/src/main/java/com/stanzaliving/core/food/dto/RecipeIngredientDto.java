/**
 * 
 */
package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author naveen.kumar
 *
 * @date 10 Aug, 2020
 *
 **/
@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class RecipeIngredientDto extends IngredientDto {

	private double quantity;
	private Double price;
	private Double cost;
	private List<PriceListingDto> kitchenWiseCost;
	private boolean missingPrice;
	private int index;
	private boolean isPrimary;

}