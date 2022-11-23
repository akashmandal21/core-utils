package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.enums.FoodDayType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class ResidenceMealUtilizationPercentDto {

	@NotBlank(message = "Residence Id is mandatory")
	private String residenceId;

	@NotNull(message = "Day Type is mandatory")
	private FoodDayType dayType;
	
	private String dayTypeName;

	private LocalDate date;

	private List<MealUtilizationDto> mealUtilizationDtos;

}