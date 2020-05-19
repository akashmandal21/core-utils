package com.stanzaliving.core.food.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceMonthlyBudgetUtilizationRequestDto {
	
	private String residenceId;
	
	private Integer budgetYear;
	
	private Integer budgetMonth;
	
	private Double budgetPerMir;

}
