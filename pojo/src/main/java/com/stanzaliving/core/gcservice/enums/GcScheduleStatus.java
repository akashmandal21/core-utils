package com.stanzaliving.core.gcservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GcScheduleStatus {

	IN_DRAFT("In draft"),CHANGED("Changed"),SUBMITTED("Submitted"),NOT_CREATED("Not created");
	
	private String text;
}
