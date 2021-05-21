package com.stanzaliving.food.v2.common.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ThaliType {
	NORMAL("Normal"),
	COMBO("Combo");

	private final String type;
}
