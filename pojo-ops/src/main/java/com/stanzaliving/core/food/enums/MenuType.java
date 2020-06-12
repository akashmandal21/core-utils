package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * @author piyush srivastava "piyush.srivastava@stanzaliving.com"
 *
 * @date 12-June-2020
 */


@Getter
@AllArgsConstructor
public enum MenuType {
	PURE_VEG("Pure Veg"),
	VEG_AND_NON_VEG("Veg and Non-Veg");

	private String menuTypeName;
}
