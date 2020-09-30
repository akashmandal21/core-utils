package com.stanzaliving.core.leaddashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LeadStatus {

	NEW_LEAD("New Lead"),
	DISQUALIFIED("Disqualified"),
	QUALIFIED("Qualified"),
	DROPPED("Dropped"),
	VISIT_SCHEDULED("Visit Scheduled"),
	VISIT_STARTED("Visit Started"),
	VISIT_COMPLETED("Visit Completed"),
	BOOKED("Booked");
	
	private String statusDescription;
}
