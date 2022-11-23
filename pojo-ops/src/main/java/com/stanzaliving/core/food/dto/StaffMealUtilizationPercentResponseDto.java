package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.core.food.enums.FoodDayType;

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
@AllArgsConstructor
@NoArgsConstructor
public class StaffMealUtilizationPercentResponseDto {

	private String residenceId;

	private double average;

	private LocalDate date;

	private List<StaffMealUtilizationDto> mealUtilizationDtos;

	private int slCount;

	private int nonSLCount;

	private FoodDayType dayType;

	private String dayTypeName;

}