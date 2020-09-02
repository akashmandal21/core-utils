package com.stanzaliving.core.food.dto;

import java.util.List;
import java.util.Map;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.enums.FoodBudgetPlannerStatus;
import com.stanzaliving.core.food.enums.FoodDayType;

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
public class StaffMealBudgetCalendarDto {

	@NotBlank(message = "Residence Id is mandatory")
	private String residenceId;

	private String residenceName;

	@NotNull(message = "Budget Month is mandatory")
	private Integer month;

	@NotNull(message = "Budget Year is mandatory")
	private Integer year;

	@NotEmpty(message = "Day type utilization is mandatory")
	private Map<FoodDayType, StaffMealUtilizationPercentResponseDto> dayTypeUtilizationRules;

	private Map<FoodDayType, StaffMealUtilizationPercentResponseDto> prevDayTypeUtilizationRules;

	@NotEmpty(message = "Meal wise utilization is mandatory")
	private List<StaffMealBudgetUtilizationCalendarDateDto> mealBudgetUtilizationCalendarDateDtoList;

	private FoodBudgetPlannerStatus budgetStatus;

}