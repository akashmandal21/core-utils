package com.stanzaliving.operations.enums;

import com.stanzaliving.core.enums.helpers.EnumValue;

public enum TransportAvailabilityMode implements EnumValue{
	PICKUP_DROP("Pick and Drop"),
	PICKUP("Pick"),
	DROP("Drop");
	
	private String value;
	
	private TransportAvailabilityMode(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
