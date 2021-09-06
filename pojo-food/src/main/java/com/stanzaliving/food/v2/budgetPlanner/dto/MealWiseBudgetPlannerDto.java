package com.stanzaliving.food.v2.budgetPlanner.dto;

import com.stanzaliving.core.operations.enums.MealType;

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
public class MealWiseBudgetPlannerDto {
	
	private MealType mealType;

	private String mealName;

	private Double plannedBudget;

	private Double actualBudget;

	private Integer mealSequence;    

}
