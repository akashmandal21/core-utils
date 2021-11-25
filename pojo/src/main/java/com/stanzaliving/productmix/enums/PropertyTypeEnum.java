package com.stanzaliving.productmix.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PropertyTypeEnum {

	SUITS("Suits"),
	SCHOLAR("Scholar");
	
	private String propertyTypeText;
}