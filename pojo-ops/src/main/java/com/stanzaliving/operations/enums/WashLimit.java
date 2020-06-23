package com.stanzaliving.operations.enums;

import lombok.Getter;

@Getter
public enum WashLimit {
	
	QUANTITY("Quantity"),
	WEIGHT("Weight"),
	UNLIMITED("Unlimited");
	
	private String value;
	
	private WashLimit(String value) {
		this.value = value;
	}
}
