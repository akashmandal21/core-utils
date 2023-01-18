package com.stanzaliving.food.v2.order.request;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

import com.stanzaliving.core.food.dto.UserBeveragePreferenceCountDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

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

	private int vegPax;

	private int nonVegPax;

	private int stanzaStaffVegPax;

	private int stanzaStaffNonVegPax;

	private int nonSlStaffVegPax;

	private int nonSlStaffNonVegPax;

	@Builder.Default
	private List<UserBeveragePreferenceCountDto> userBeveragePreferenceCountDtos = new ArrayList<>();

}
