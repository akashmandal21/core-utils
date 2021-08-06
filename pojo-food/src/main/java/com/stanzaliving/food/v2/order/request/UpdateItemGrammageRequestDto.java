package com.stanzaliving.food.v2.order.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 2.0
 *
 * @since 06-Aug-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateItemGrammageRequestDto {

	@NotBlank(message = "Menu selection is mandatory")
	private String residenceFoodMenuId;

//	@NotEmpty(message = "Items selection is mandatory")
//	private List<String> items;

	private int vegPax;

	private int nonVegPax;

	private int stanzaStaffVegPax;

	private int stanzaStaffNonVegPax;

}
