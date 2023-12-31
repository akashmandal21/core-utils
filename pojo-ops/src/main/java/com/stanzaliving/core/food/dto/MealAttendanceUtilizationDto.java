package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class MealAttendanceUtilizationDto {

	private MealType mealType;

	private String mealName;

	private Integer attendance;

	private Double plannedUtilization;

	private Double actualUtilization;

	private Integer mealSequence;

	@Builder.Default
	private Boolean updated = false;

}