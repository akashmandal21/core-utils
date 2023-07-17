package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FaqStatus {
	
	LIVE("Live"), 
	INACTIVE("Inactive"), 
	IN_DRAFT("In Draft");
	
	public String statusName;
}
