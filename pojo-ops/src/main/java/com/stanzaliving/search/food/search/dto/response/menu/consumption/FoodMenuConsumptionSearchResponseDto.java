package com.stanzaliving.search.food.search.dto.response.menu.consumption;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 28-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuConsumptionSearchResponseDto {

	private MicromarketConsumptionDto micromarket;

	private List<MicromarketMealsConsumptionDto> micromarketMeals;

	private List<ResidenceConsumptionDto> residences;

	private List<ResidenceMealConsumptionDto> residenceMeals;
}
