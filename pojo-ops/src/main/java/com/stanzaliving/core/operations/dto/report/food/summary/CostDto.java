package com.stanzaliving.core.operations.dto.report.food.summary;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CostDto {

	private double expectedMealCost;

	private int movedInResidents;

	private double totalMealCost;

	private double budgetedMealCost;

	private int occupiedBeds;

	private int totalMealsOrdered;

}