package com.stanzaliving.core.food.dto;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.enums.FoodDayType;
import com.stanzaliving.core.food.response.ResidenceMealUtilizationPercentResponseDto;

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
public class MealBudgetCalendarDto {

	@NotNull
	private String residenceId;

	@NotNull
	private Integer month;

	@NotNull
	private Integer year;

	private Double monthlyBudget;

	@NotEmpty
	private Map<FoodDayType, ResidenceMealUtilizationPercentResponseDto> dayTypeUtilizationRules;

	private Map<FoodDayType, ResidenceMealUtilizationPercentResponseDto> prevDayTypeUtilizationRules;

	@NotEmpty
	private List<MealBudgetUtilizationCalendarDateDto> mealBudgetUtilizationCalendarDateDtoList;

}
