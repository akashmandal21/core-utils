package com.stanzaliving.core.leadership.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LeadershipCommand {

	APPROVE("Approved"),REJECT("Rejected"),SENDBACK("Sent Back"),APPROVE_L1("L1 Approved"),SENDBACK_L1("L1 Sent Back");
	
	private String command;
}
