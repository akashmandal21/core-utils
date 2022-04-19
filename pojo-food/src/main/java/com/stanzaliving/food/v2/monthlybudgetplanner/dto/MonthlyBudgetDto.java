package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
public class MonthlyBudgetDto {

	private Double totalMonthlyBudget;
	private List<DayWiseBudgetDto> dayWiseBudgetDtoList;

}
