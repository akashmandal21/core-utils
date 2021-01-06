package com.stanzaliving.website.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
	ENABLED("Enabled"), 
	DISABLED("Disabled"), 
	COMINGSOON("Coming Soon"),
	ALL("All");
	public String statusName;
}
