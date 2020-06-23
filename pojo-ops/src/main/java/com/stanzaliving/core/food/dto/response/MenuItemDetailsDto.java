package com.stanzaliving.core.food.dto.response;

import com.stanzaliving.core.food.dto.FoodItemDto;

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
 * @date 22 Jun, 2020
 *
 */
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemDetailsDto extends FoodItemDto {

	private Float rating;

	private Double cost;
	
	private Integer delightedPercent;

	private Integer disgustedPercent;

	private Integer orderedInLastThreeDays;

	private Integer orderedInLastSevenDays;

	private Integer orderedInLastThirtyDays;
}