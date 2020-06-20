package com.stanzaliving.operations.enums;

import lombok.Getter;

@Getter
public enum WashLimit {
	
	Quantity("Quantity"),
	Weight("Weight"),
	Unlimited("Unlimited");
	
	private String value;
	
	private WashLimit(String value) {
		this.value = value;
	}
}
