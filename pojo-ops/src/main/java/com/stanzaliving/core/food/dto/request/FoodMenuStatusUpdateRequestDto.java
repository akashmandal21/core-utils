/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

import javax.validation.constraints.NotNull;

import com.stanzaliving.core.food.enums.FoodMenuStatus;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author naveen.kumar
 *
 * @date 04-May-2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
public class FoodMenuStatusUpdateRequestDto extends FoodMenuSubmitRequestDto {

	@NotNull(message = "Menu Status is Mandatory")
	private FoodMenuStatus menuStatus;
}