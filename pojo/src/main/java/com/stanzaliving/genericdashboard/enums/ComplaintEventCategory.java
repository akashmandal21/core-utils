package com.stanzaliving.genericdashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ComplaintEventCategory {

	COMPLAINT_LOGGED("Complaint Logged"),
	COMPLAINT_CLOSED(" Complaint Closed"),
	COMPLAINT_RESOLVED("Complaint Resolved"),
	COMPLAINT_FEEDBACK_GIVEN("Complaint Feedback given");

	String complaintEventCategoryValue;
}
