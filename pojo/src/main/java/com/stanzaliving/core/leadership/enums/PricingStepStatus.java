package com.stanzaliving.core.leadership.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PricingStepStatus{
	
	PENDING_APPROVAL("Pending Approval"), SENT_BACK("Sent Back"), REJECTED("Rejected"), APPROVED("Approved By Leadership");
	
	private String pricingStatus;

}
