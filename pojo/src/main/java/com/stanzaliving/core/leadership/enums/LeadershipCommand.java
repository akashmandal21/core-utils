package com.stanzaliving.core.leadership.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LeadershipCommand {

	APPROVE("Approved","Property Approval Successful"),REJECT("Rejected","Property Rejection Successful"),SENDBACK("Sent Back","Property Successfully Sent Back"),APPROVE_L1("L1 Approved","Property L1 Approval Successful"),SENDBACK_L1("L1 Sent Back","Property Successfully Sent Back"),APPROVED_BY_SANDEEP("Sow Approved By Sandeep","Property SOW Approval Successful"),SENT_BACK_BY_SANDEEP("Sent Back By Sandeep","Property Successfully Sent Back");
	
	private String command;
	
	private String responseMessage;
}
