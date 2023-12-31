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
public class StaffMealAttendanceUtilizationDto {

	private MealType mealType;

	private String mealName;

	@Builder.Default
	private Double slStaffUtilization = 0d;

	@Builder.Default
	private Double nonSlStaffUtilization = 0d;

	private Integer mealSequence;

	@Builder.Default
	private Boolean updated = false;

}