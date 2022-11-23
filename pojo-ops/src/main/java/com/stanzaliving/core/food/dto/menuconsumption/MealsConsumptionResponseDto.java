package com.stanzaliving.core.food.dto.menuconsumption;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
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
public class MealsConsumptionResponseDto implements Serializable {

	private static final long serialVersionUID = 57337262736273L;

	private Double consumptionPercent;

	private List<MealConsumptionResponseDto> mealsConsumption;
}
