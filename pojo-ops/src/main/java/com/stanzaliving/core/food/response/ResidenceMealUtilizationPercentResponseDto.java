package com.stanzaliving.core.food.response;

import java.time.LocalDate;

import com.stanzaliving.core.food.enums.FoodDayType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class ResidenceMealUtilizationPercentResponseDto {

	private Long id;

	private String residenceId;

	private Double average;

	private LocalDate date;

	private Double breakfast;

	private Double lunch;

	private Double eveningSnacks;

	private Double dinner;

	private Double brunch;

	private Double lunchTiffin;
	
	private FoodDayType dayType;
}
