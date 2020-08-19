package com.stanzaliving.core.food.dto;

import java.time.LocalDate;

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

	@NotNull
	private String residenceId;

	private LocalDate date;

	private Double breakfast;

	private Double lunch;

	private Double eveningSnacks;

	private Double dinner;

	private Double brunch;

	private Double lunchTiffin;

	@NotNull
	private FoodDayType dayType;

}