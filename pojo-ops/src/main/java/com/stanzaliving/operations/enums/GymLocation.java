package com.stanzaliving.operations.enums;

import com.stanzaliving.core.enums.helpers.EnumValue;

public enum GymLocation implements EnumValue{
	
	IN_RESIDENCE("In-Residence"),
	OTHER_RESIDENCE("Other Residence");
	
	private String value;
	
	private GymLocation(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
}
