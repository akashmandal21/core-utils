/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.base.common.dto.AbstractDto;
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
public class ResidenceDatewiseMealDto extends AbstractDto {

	@NotBlank(message = "Residence Id is mandatory")
	private String residenceId;

	private String residenceName;

	@NotNull(message = "Meal Type is mandatory")
	private MealType mealType;

	private String mealName;

	@NotNull(message = "Meal Date is mandatory")
	private LocalDate date;

	@NotNull(message = "Meal Start Time is mandatory")
	private LocalTime startTime;

	@NotNull(message = "Meal End Time is mandatory")
	private LocalTime endTime;

}