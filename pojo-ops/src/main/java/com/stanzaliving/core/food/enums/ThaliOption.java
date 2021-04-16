package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 16-Apr-2021
 *
 * @version 1.0
 */

@Getter
@AllArgsConstructor
public enum ThaliOption {

	NORTH_INDIAN_ROTI_THALI("North Indian - Roti Thali"),

	NORTH_INDIAN_RICE_THALI("North Indian - Rice Thali"),

	NORTH_INDIAN_REGULAR_THALI("North Indian - Regular Thali"),

	SOUTH_INDIAN_RICE_THALI("South Indian - Rice Thali"),

	SMART_COMBO("Smart Combo"),

	SINGLE_MENU_BOXED("Single Menu - Boxed"),

	SINGLE_MENU_BUFFET("Single Menu - Buffet");

	private String thaliName;

}
