package com.stanzaliving.food.v2.order.request;

import java.util.List;

import com.stanzaliving.core.food.dto.UserBeveragePreferenceCountDto;

import lombok.AllArgsConstructor;
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
 * @since 02-Aug-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MenuPaxCountRequestDto extends PaxCountRequestDto {

	private String residenceFoodMenuId;

	private boolean defaultMenu;

	private String menuName;

	private List<UserBeveragePreferenceCountDto> userBeveragePreferenceCountDtos;

	private String defaultBeverage;
}
