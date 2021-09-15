package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EventDurationType {
	ROLLING_DURATION("Rolling Duration"),
	FIXED_DURATION("Fixed Duration");
	
	 String eventDurationType;
}
