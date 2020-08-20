package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
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

	@Builder.Default
	private Integer residents = 0;

	@Builder.Default
	private Double residentsMonthlyBudget = 0d;

	@Builder.Default
	private Double residentMaxCost = 0d;

	@Builder.Default
	private Integer staff = 0;

	@Builder.Default
	private Double staffMonthlyBudget = 0d;

	@Builder.Default
	private Double staffMaxCost = 0d;

	@Builder.Default
	private Integer nonStaff = 0;

	@Builder.Default
	private Double nonStaffMonthlyBudget = 0d;

	@Builder.Default
	private Double nonStaffMaxCost = 0d;

}
