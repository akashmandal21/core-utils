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
public class CombinedBudgetPlannerDto {

	private BudgetPlannerDto overallBudget;

	private BudgetPlannerDto residentBudget;

	private BudgetPlannerDto slStaffBudget;

	private BudgetPlannerDto nonSLStaffBudget;

}