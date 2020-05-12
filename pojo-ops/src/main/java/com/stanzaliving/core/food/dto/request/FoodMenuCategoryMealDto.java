package com.stanzaliving.core.food.dto.request;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 08-May-2020
 *
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryMealDto {

	private String menuCategoryId;

	private MealType mealType;

	private boolean mondayActive;

	private boolean tuesdayActive;

	private boolean wednesdayActive;

	private boolean thursdayActive;

	private boolean fridayActive;

	private boolean saturdayActive;

	private boolean sundayActive;

	private Double expectedVegCost;

	private Double expectedNonVegCost;

}