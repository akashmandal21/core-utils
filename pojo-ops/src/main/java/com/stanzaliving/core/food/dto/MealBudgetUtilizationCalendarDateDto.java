package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.core.food.enums.FoodDayType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString(callSuper = true)
public class MealBudgetUtilizationCalendarDateDto {

	private LocalDate date;

	private FoodDayType dayType;

	private Integer mir;

	private Double cost;

	private List<MealAttendanceUtilizationDto> mealAttendanceUtilizationDtoList;

}
