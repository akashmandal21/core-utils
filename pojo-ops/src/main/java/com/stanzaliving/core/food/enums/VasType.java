package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author piyush.srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @since 24-Sep-2020
 *
 * @version 1.0
 */


@Getter
@AllArgsConstructor
public enum VasType {
	VAS("Vas"),
	ADD_ON("Add On");

	private String vasTypeName;
}
