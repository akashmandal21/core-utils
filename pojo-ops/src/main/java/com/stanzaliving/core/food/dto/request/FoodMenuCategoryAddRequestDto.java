/**
 * 
 */
package com.stanzaliving.core.food.dto.request;

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
 * @date 22-Apr-2020
 *
 **/
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuCategoryAddRequestDto {

	@NotBlank(message = "City is Mandatory for Menu Category")
	private String cityId;

	@NotBlank(message = "Name is Mandatory for Menu Category")
	private String categoryName;

	@NotNull(message = "Stanza Kitchen Flag is Mandatory")
	private Boolean stanzaKitchen;

}