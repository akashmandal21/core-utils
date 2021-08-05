package com.stanzaliving.productmix.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PropertyTypeEnum {

	//Added for reporting, to show leads whose residence type is null
	MANAGED_APARTMENTS("Managed Apartments"),
	SUITS("Suits"),
	SCHOLAR("Scholar");
	
	private String propertyTypeText;
}