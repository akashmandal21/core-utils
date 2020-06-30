package com.stanzaliving.core.user.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BloodGroup {
	
	O_POSITIVE("O+"),
	O_NEGATIVE("O-"),
	A_POSITIVE("A+"),
	A_NEGATIVE("A-"),
	B_POSITIVE("B+"),
	B_NEGATIVE("B-"),
	AB_POSITIVE("AB+"),
	AB_NEGATIVE("AB-");

	private String name;
}
