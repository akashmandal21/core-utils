package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StaffMealUtilization {

	private MealType mealType;

	@Builder.Default
	private Double slStaffUtilization = 0d;

	@Builder.Default
	private Double nonSLStaffUtilization = 0d;

}
