package com.stanzaliving.core.food.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum commercialTag {
	HIGH ("High"),
	MEDIUM ("Medium"),
	LOW ("Low");

	private final String tagName;
}
