/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import java.time.LocalTime;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class ResidenceDatewiseMealRequestDto {

	@NotBlank(message = "UUID is mandatory")
	private String uuid;

	@NotNull(message = "Meal Start Time is mandatory")
	private LocalTime startTime;

	@NotNull(message = "Meal End Time is mandatory")
	private LocalTime endTime;

	@NotNull(message = "Meal Status is Mandatory")
	private Boolean status;
}