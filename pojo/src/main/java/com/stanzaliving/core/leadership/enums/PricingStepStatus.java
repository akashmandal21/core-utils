package com.stanzaliving.core.leadership.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PricingStepStatus{
	
	PENDING_APPROVAL("Pending Approval","#000000"), SENT_BACK("Sent Back","#990199"),  APPROVED("Approved By Leadership","#3366CC");
	
	private String pricingStatus;
	
	private String color;
	
}
