package com.stanzaliving.core.food.dto;

import com.stanzaliving.core.operations.enums.MealType;

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
public class StaffMealUtilizationDto {

	private MealType mealType;

	private String mealName;

	private double slStaffUtilization;

	private double nonSLStaffUtilization;

	private Integer sequence;

}