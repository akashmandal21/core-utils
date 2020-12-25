package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
	ENABLED("Enabled"), 
	DISABLED("Disabled"), 
	COMMINGSOON("Comming Soon");

	public String statusName;
}
