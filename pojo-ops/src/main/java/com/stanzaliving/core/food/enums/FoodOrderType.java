package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 10-Sep-2020
 *
 * @version 1.0
 */

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum FoodOrderType {
	PACKAGED("Packaged Order"),
	KITCHEN("Cafe Order"),
	CAFE("Cafe Order");

	private String orderTypeName;
}
