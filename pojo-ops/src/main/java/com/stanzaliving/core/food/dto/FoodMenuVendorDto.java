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
 * @date 27-Apr-2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuVendorDto {

	@NotBlank(message = "Food Menu Group Id is Mandatory")
	private String foodMenuGroupId;
	
	private boolean vendorsSelected;

	@NotEmpty(message = "Residence Food Menu Vendors are mandatory")
	private List<ResidenceFoodMenuVendorDto> residenceFoodMenuVendorDtos;

}