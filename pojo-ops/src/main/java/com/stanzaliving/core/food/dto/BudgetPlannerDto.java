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
	
	private String name;

	@Builder.Default
	private Double monthlyBudget = 0d;

	@Builder.Default
	private Double utilisation = 0d;

	@Builder.Default
	private Double budgetPerPerson = 0d;

	@Builder.Default
	private Integer mir = 0;

	@Builder.Default
	private Double maxCost = 0d;

}
