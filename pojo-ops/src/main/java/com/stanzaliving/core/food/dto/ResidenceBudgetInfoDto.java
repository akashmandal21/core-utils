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
public class ResidenceBudgetInfoDto {

	private Double monthlyBudget;

	private Double mtdUtilization;

	private Double estimatedMonthlyCost;

	private Double excessBudget;

	private Double budgetDeficit;

	private Double todayBudget;

}
