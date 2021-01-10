/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author naveen.kumar
 *
 * @date 04-May-2020
 *
 **/
@Getter
@Setter
@ToString
public class FoodMenuSubmitRequestDto {

	@NotBlank(message = "Food menu group is mandatory")
	private String foodMenuGroupId;

	@Valid
	private List<ResidenceOperationalDto> residenceOperationals;
}