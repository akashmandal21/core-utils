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

	private Double mtdCost;

	private Double estimatedMonthlyCost;

	private Double mtdBuffer;

	private Double mtdBufferPercentage;
	
	private Double mtdTargetUtilization;
	
	private Double mtdActualUtilization;

}
