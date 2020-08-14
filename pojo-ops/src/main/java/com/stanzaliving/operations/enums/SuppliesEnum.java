package com.stanzaliving.operations.enums;

import com.stanzaliving.core.enums.helpers.EnumValue;

import lombok.Getter;

@Getter
public enum SuppliesEnum implements EnumValue{
	
	BRAKFAST_ONLY("Breakfast Only"),
	ALL_DAY("All day");
	
	private String value;
	
	private SuppliesEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
