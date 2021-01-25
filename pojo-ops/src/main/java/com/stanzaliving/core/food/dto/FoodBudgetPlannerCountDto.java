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
public class FoodBudgetPlannerCountDto {

	private Integer all;

	private Integer pendingBudget;

	private Integer budgetPlanned;

	private Integer pendingApproval;

	private Integer approved;

}
