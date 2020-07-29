package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.util.List;

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
public class StaffMealUtilizationPercentResponseDto {

	private String residenceId;

	@Builder.Default
	private Double average = 0d;

	private LocalDate date;

	private List<StaffMealUtilizationDto> mealUtilizationDtos;

	@Builder.Default
	private Integer slCount = 0;

	@Builder.Default
	private Integer nonSLCount = 0;

	private FoodDayType dayType;

}
