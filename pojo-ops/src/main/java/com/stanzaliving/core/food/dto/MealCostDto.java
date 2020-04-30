package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.operations.enums.MealType;

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
public class MealCostDto {

	private MealType mealType;
	
	private Double budget;

	private Double cost;

	private boolean costInBudget;
}