package com.stanzaliving.food.v2.preference.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum UserPreferenceSortingField {
	USER_NAME("User Name"),
	USER_CODE("User Code"),
	SYSTEM_GENERATED("System Generated")
	;
	private final String field;
	
}
