package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import java.time.LocalDate;
import java.util.List;

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
public class DayWiseBudgetDto {
	
	private LocalDate date;

	private Boolean specialEvent;

	private Boolean specialMenuAdded;

	private String dayWiseMonthlyBudgetId;
	
	private List<SpecialEventDetailDto> specialEventDetailDto;

	private List<MealWiseBudgetPlannerDto> mealWiseBudgetPlannerDto;
	
	private Double totalPlannedcost;
	
	private Double totalBudgetedcost;

	private Boolean weeklySubmitted;
    

}
