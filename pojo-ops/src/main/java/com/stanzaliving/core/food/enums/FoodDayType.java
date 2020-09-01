/**
 * 
 */
package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author naveen.kumar
 *
 * @date 17-Apr-2020
 *
 **/
@Getter
@AllArgsConstructor
public enum FoodDayType {

	WEEK_DAY("Week Day"),
	WEEK_END("Week End"),
	HOLIDAY("Holiday"),
	NONVEG_DAY("Spl Meal Day");

	private String dayName;
}