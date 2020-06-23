package com.stanzaliving.operations.enums;

public enum GymLocation {
	
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
