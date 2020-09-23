package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 22-Sep-2020
 *
 * @version 1.0
 */

@Getter
@AllArgsConstructor
public enum VasItemState {
	SOLID("Solid"),
	LIQUID("Liquid"),
	SEMI_SOLID("Semi Solid");

	private String stateName;
}
