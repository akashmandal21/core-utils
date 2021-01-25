package com.stanzaliving.core.food.dto.request;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * 
 * @author naveen.kumar
 *
 * @date 14 Aug, 2020
 *
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FnBPriceCalculateRequestDto {

	private Double foodMargin;

	private Double utilityCost;

	private Double packagingCost;

	@NotEmpty(message = "Meal Mappings are mandatory")
	private List<FoodMenuCategoryMealDto> meals;
}