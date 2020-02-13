package com.stanzaliving.core.leadership.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LeadershipCommand {

	APPROVE("Approved"),REJECT("Rejected"),SENDBACK("Sent Back"),APPROVE_L1("L1 Approved"),SENDBACK_L1("L1 Sent Back"),APPROVED_BY_SANDEEP("Sow Approved By Sandeep"),SENT_BACK_BY_SANDEEP("Sent Back By Sandeep");
	
	private String command;
}
