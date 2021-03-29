package com.stanzaliving.search.food.search.dto.response.menu.fps;

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
 * @since 26-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuItemFpsResponseDto {

	private MicromarketIdFpsDto micromarket;

	private List<MicromarketMealFpsDto> micromarketMeals;

	private List<ResidenceIdFpsDto> residences;

	private List<ResidenceIdMealFpsDto> residenceMeals;

}
