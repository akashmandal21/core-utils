package com.stanzaliving.food.v2.monthlybudgetplanner.request.dto;

import java.time.LocalDate;

import com.stanzaliving.core.food.enums.FoodDayType;

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
public class MonthlyBudgetPlannerRequestDto {
	
	private LocalDate date;

	private FoodDayType dayType;

	private Boolean specialEvent;
	
	private Double plannedcost;
	
	private Double budgetedcost;
    

}
