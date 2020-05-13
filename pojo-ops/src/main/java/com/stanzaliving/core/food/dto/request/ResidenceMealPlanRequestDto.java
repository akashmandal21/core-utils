/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import java.time.LocalDate;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.dto.ResidenceMealLevelPlanDto;

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
public class ResidenceMealPlanRequestDto {

	@NotBlank(message = "Residence Id is mandatory")
	private String residenceId;

	@NotNull(message = "Meal Plan Activation Date is Mandatory")
	private LocalDate activationDate;

	@NotEmpty(message = "Residence Meal Level Plans Cannot be Blank")
	private List<ResidenceMealLevelPlanDto> residenceMealLevelPlanDtos;

}