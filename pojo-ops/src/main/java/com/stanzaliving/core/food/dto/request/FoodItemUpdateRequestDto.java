/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

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
 * @date 21-Apr-2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodItemUpdateRequestDto extends FoodItemAddRequestDto {

	@NotBlank(message = "Item Name is Mandatory")
	private String uuid;

}