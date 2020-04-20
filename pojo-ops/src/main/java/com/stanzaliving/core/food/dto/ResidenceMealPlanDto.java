/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

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
public class ResidenceMealPlanDto {

	@NotBlank(message = "Residence Id is mandatory")
	private String residenceId;
	
	private String residenceName;

	@NotEmpty(message = "Residence Meal Level Plans Cannot be Blank")
	private List<ResidenceMealLevelPlanDto> residenceMealLevelPlanDtos;

}