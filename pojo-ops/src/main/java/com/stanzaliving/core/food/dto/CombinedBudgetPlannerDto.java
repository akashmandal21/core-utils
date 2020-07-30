package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class CombinedBudgetPlannerDto {
	
	private BudgetPlannerDto overallBudget;
	
	private BudgetPlannerDto residentBudget;
	
	private BudgetPlannerDto slStaffBudget;
	
	private BudgetPlannerDto nonSLStaffBudget;

}
