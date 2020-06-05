package com.stanzaliving.core.food.response;

import java.time.LocalDate;

import com.stanzaliving.core.food.enums.FoodDayType;

import lombok.AllArgsConstructor;
import lombok.Builder;
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

	private String residenceId;

	@Builder.Default
	private Double average = 0d;

	private LocalDate date;

	@Builder.Default
	private Double breakfast = 0d;

	@Builder.Default
	private Double lunch = 0d;

	@Builder.Default
	private Double eveningSnacks = 0d;

	@Builder.Default
	private Double dinner = 0d;

	@Builder.Default
	private Double brunch = 0d;

	@Builder.Default
	private Double lunchTiffin = 0d;

	private FoodDayType dayType;
}
