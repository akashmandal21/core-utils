package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EventDurationType {
	FIXED_DURATION("Fixed Duration"),
	ROLLING_DURATION("Rolling Duration");
	
	 String eventDurationType;
}
