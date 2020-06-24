package com.stanzaliving.operations.enums;

import lombok.Getter;

@Getter
public enum TransportSchedule implements EnumValue{
	
	SCHEDULED("Pre-Planned Route"),
	ON_DEMAND("On demand");
	
	private String value;
	
	private TransportSchedule(String value) {
		this.value = value;
	}
	
}
