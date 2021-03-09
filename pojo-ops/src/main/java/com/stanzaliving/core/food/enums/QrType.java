package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @version 1.0
 *
 * @since 09-Mar-2021
 */

@Getter
@AllArgsConstructor
public enum QrType {

	NORMAL("Meal"),

	LUNCH_TIFFIN("Lunch Tiffin");

	private String label;
}
