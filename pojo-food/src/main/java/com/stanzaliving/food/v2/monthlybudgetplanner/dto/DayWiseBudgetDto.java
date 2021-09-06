package com.stanzaliving.food.v2.monthlybudgetplanner.dto;

import java.time.LocalDate;
import java.util.List;

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
public class DayWiseBudgetDto {
	
	private LocalDate date;

	private FoodDayType dayType;

	private Boolean specialEvent;
	
	private List<SpecialEventDetailDto> specialEventDetailDto;

	private List<MealWiseBudgetPlannerDto> mealWiseBudgetPlannerDto;
	
	private Double plannedcost;
	
	private Double budgetedcost;
    

}
