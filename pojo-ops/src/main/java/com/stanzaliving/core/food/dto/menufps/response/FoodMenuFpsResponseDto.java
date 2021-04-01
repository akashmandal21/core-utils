package com.stanzaliving.core.food.dto.menufps.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 2.0
 *
 * @since 24-Jan-2021
 */

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class FoodMenuFpsResponseDto implements Serializable {

	private static final long serialVersionUID = 7262736273L;

	private String menuGroupId;

	private FoodMenuMicroMarketFpsDto micromarketFps;
}
