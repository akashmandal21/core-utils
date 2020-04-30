package com.stanzaliving.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PoStatus {

	IN_DRAFT("In Draft",0),
	TH_APPROVAL_PENDING("Transformation Head Approval Pending",1),
	TH_APPROVED("Approved By Transformation Head",2),
	SENT_BACK_BY_TH("Sent Back By Transformation Head",-1),
	LEADERSHIP_APPROVAL_PENDING("Leadership Approval Pending",-1), //REMOVED
	LEADERSHIP_APPROVED("Approved By Leadership",-1), //REMOVED
	SENT_BACK_BY_LEADERSHIP("Sent Back By Leadership",-1),//REMOVED
	WORK_COMPLETED("Work Completed",3),
	INVOICE_SUBMITTED("Invoice Submitted",4),
	SENT_BACK_BY_FINANCE("Sent Back By Finance",-1);

	private String status;
	private Integer order;

}
