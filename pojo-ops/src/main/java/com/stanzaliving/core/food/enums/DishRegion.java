package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author piyush.srivastava
 *
 * @version 1.0
 *
 * @since 25-Aug-2020
 */

@Getter
@AllArgsConstructor
public enum DishRegion {
	INDIAN("Mix"),
	NORTH("North Indian"),
	SOUTH("South Indian"),
	CONTINENTAL("Continental");

	private String regionName;
}
