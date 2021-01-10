package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MonthlyBudgetPlanChangelogType {

	BUDGET("Budget"),
	HOLIDAYS("Holidays"),
	UTILISATION_RULES("Utilisation Rules");

	private String monthlyBudgetPlanChangelogName;;

}
