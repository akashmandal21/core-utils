package com.stanzaliving.core.food.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuBudgetDto {

	private boolean budgetUtilizationInLimit;
	
	private List<MealCostDto> weeklyMealCosts;

	private List<MealCostDto> monthlyMealCosts;

}