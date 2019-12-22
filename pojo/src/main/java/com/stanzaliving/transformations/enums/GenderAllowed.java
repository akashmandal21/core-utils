package com.stanzaliving.transformations.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum GenderAllowed {

	BOYS("Boys"),GIRLS("Girls"),COLIVING("Co-Living");
	
	String gender;
}
