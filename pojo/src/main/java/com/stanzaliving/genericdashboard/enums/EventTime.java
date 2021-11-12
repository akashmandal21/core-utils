package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EventTime {
	DAYS("Days"),
	HOURS("Hours"),
	MINUTES("Minutes");
	
	 String value;
}
