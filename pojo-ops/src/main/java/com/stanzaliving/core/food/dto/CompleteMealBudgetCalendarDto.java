package com.stanzaliving.core.food.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CompleteMealBudgetCalendarDto {

	private StaffMealBudgetCalendarDto staffMealBudgetCalendarDto;

	private MealBudgetCalendarDto residentMealBudgetCalendarDto;

}
