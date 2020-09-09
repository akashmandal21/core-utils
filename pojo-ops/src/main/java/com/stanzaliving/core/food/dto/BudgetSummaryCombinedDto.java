package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BudgetSummaryCombinedDto {

	private int residents;

	private double residentsCountAvg;

	private double residentsMonthlyBudget;

	private double residentMaxCost;

	private int staff;

	private double staffCountAvg;

	private double staffMonthlyBudget;

	private double staffMaxCost;

	private int nonStaff;

	private double nonSlCountAvg;

	private double nonStaffMonthlyBudget;

	private double nonStaffMaxCost;

}