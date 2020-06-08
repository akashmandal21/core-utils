package com.stanzaliving.core.food.dto;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotBlank;
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

	@NotBlank(message = "Residence Id is mandatory")
	private String residenceId;
	
	private String residenceName;

	@NotNull(message = "Budget Month is mandatory")
	private Integer month;

	@NotNull(message = "Budget Year is mandatory")
	private Integer year;

	private Double monthlyBudget;
	
	private Double estimatedMonthlyCost;
	
	private Double mtdUtlization;
	
	private Double targetUtilzation;
	
	private Double expectedUtilzation;
	
	@NotEmpty(message = "Day type utilization is mandatory")
	private Map<FoodDayType, ResidenceMealUtilizationPercentResponseDto> dayTypeUtilizationRules;

	private Map<FoodDayType, ResidenceMealUtilizationPercentResponseDto> prevDayTypeUtilizationRules;

	@NotEmpty(message = "Meal wise utilization is mandatory")
	private List<MealBudgetUtilizationCalendarDateDto> mealBudgetUtilizationCalendarDateDtoList;

}