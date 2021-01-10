package com.stanzaliving.core.food.response;

import java.time.LocalDate;
import java.util.List;

import com.stanzaliving.core.food.dto.MealUtilizationDto;
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
public class ResidenceMealUtilizationPercentResponseDto {

	private String residenceId;

	private double average;

	private LocalDate date;

	private FoodDayType dayType;

	private String dayTypeName;

	private List<MealUtilizationDto> mealUtilizationDtos;
}