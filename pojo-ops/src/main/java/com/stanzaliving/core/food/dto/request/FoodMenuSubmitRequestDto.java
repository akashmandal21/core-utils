/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

import lombok.Getter;

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
}