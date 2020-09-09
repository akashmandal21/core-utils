package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FoodBudgetPlannerStatus {

	UNDER_DRAFT("Under Draft"),
	SUBMITTED("Submitted - Pending Approval"),
	APPROVED("Approved"),
	BUDGETED("Budgeted"),
	NOT_PLANNED("Not Planned");

	private String budgetStatus;

}
