/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.time.LocalTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.operations.enums.MealType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 20-Apr-2020
 *
 **/
@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceMealLevelPlanDto {

	@NotBlank(message = "UUID is mandatory for Meal")
	private String uuid;

	@NotNull(message = "Meal Type is mandatory")
	private MealType mealType;

	private String mealName;

	@NotNull(message = "Meal Start Time is mandatory")
	private LocalTime startTime;

	@NotNull(message = "Meal End Time is mandatory")
	private LocalTime endTime;

	private boolean status;

	private boolean sundayActive;

	private boolean mondayActive;

	private boolean tuesdayActive;

	private boolean wednesdayActive;

	private boolean thursdayActive;

	private boolean fridayActive;

	private boolean saturdayActive;

}