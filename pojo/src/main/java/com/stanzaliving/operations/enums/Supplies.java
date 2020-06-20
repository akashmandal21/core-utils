package com.stanzaliving.operations.enums;

import lombok.Getter;

@Getter
public enum Supplies {
	
	BRAKFAST_ONLY("Breakfast Only"),
	ALL_DAY("All day");
	
	private String value;
	
	private Supplies(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
