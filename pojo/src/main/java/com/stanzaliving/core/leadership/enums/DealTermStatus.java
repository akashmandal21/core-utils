package com.stanzaliving.core.leadership.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DealTermStatus{
	
	REJECTED("Rejected"), APPROVED("Approved By Leadership");
	
	private String pricingStatus;

}
