package com.stanzaliving.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PoStatus {

	IN_DRAFT("In Draft"),TH_APPROVAL_PENDING("Transformation Head Approval Pending"),TH_APPROVED("Approved By Transformation Head"),
	SENT_BACK_BY_TH("Sent Back By Transformation Head"),LEADERSHIP_APPROVAL_PENDING("Leadership Approval Pending"),
	LEADERSHIP_APPROVED("Approved By Leadership"),SENT_BACK_BY_LEADERSHIP("Sent Back By Leadership"),
	WORK_COMPLETED("Work Completed"),
	INVOICE_SUBMITTED("Invoice Submitted"), SENT_BACK_BY_FINANCE("Sent Back By Finance");
	
	private String status;

}
