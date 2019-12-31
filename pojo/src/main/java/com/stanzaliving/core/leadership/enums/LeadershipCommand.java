package com.stanzaliving.core.leadership.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LeadershipCommand {

	APPROVE("Approved"),REJECT("Rejected"),SENDBACK("Send Back");
	
	private String command;
}
