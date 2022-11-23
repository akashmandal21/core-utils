package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BudgetPlannerDto {

	private String name;

	private double monthlyBudget;

	private double utilisation;

	private double budgetPerPerson;

	private int mir;

	private double mirAvg;

	private double maxCost;

}