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
public enum PackagingMaterial {
	PLASTIC("Plastic"),
	PAPER("Paper");

	private String materialName;
}
