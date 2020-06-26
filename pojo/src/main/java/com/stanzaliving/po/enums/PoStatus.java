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
	SENT_BACK_BY_FINANCE("Sent Back By Finance",-1),
	TH_PARTIAL_CANCELLATION_PENDING("Transformation Head Partial Cancellation Pending",1),
	TH_PARTIALLY_CANCELLED("Partially Cancelled By Transformation Head",-1),
	TH_CANCELLATION_PENDING("Transformation Head Cancellation Pending",1),
	TH_CANCELLED("Cancelled By Transformation Head",-1),
	PO_CLOSED("Po Closed", 5),
	SALES_CT_APPROVAL_PENDING("Sales Central Team Approval Pending",1),
	SALES_CT_APPROVED("Approved By Sales Central Team",2);

	private String status;
	private Integer order;
}


