package com.stanzaliving.core.leadership.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PricingStepStatus{
	
	PENDING_APPROVAL("Pending Approval","#FF9902"), SENT_BACK("Sent Back","#DC3913"),  APPROVED("Approved By Leadership","#3366CC"),UNDER_DRAFT("Under Draft","#990199");
	
	private String pricingStatus;
	
	private String color;
	
}
