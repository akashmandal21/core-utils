package com.stanzaliving.vendor.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum VendorStatus {

	IN_DRAFT("In Draft"),SUBMITTED("Pending Approval"),APPROVED("Approved"),REJECTED("Rejected");
	
	private String status;
}
