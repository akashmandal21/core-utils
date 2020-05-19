package com.stanzaliving.core.food.dto.request;

import java.time.Month;

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
	
	private Month budgetMonth;
	
	private Double budgetPerMir;

}
