package com.stanzaliving.operations.enums;

import lombok.Getter;

@Getter
public enum PaymentMode {
	
	PREPAID("Prepaid"),
	INCLUDED("Included"),
	POSTPAID("Postpaid");
	
	private String value;
	
	private PaymentMode(String value) {
		this.value = value;
	}
}
