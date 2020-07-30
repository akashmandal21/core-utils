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
public class BudgetPlannerDto {

	@Builder.Default
	private Double monthlyBudget = 0d;

	@Builder.Default
	private Double utilisation = 0d;

	@Builder.Default
	private Double budgetPerPerson = 0d;

}
