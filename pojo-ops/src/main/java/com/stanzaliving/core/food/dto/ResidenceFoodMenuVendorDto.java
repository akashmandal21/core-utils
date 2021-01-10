/**
 * 
 */
package com.stanzaliving.core.food.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * @author naveen.kumar
 *
 * @date 27-Apr-2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceFoodMenuVendorDto {

	@NotBlank(message = "Residence Id is mandatory")
	private String residenceId;

	private String residenceName;

	@NotBlank(message = "Residence meal wise vendors are mandatory")
	private List<MealWiseFoodMenuVendorDto> mealWiseFoodMenuVendorDtos;

}