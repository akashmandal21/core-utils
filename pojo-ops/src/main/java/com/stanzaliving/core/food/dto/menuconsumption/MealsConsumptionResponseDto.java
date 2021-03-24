package com.stanzaliving.core.food.dto.menuconsumption;

import com.stanzaliving.core.food.dto.menufps.response.MealFpsResponseDto;
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
 * @version 2.0
 *
 * @since 28-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MealsConsumptionResponseDto {

	private Double consumptionPercent;

	private List<MealConsumptionResponseDto> mealsConsumption;
}
