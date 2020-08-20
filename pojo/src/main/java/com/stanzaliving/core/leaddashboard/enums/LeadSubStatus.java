package com.stanzaliving.core.leaddashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LeadSubStatus {

	NEW_LEAD("New Lead"),
	CALLED("Called"),
	CONNECTED("Connected"),
	PRE_QUALIFICATION_FOLLOW_UP("Pre Qualification Follow Up"),
	RNR("RNR"),
	
	PRE_VISIT_SCHEDULED_FOLLOW_UP("Pre Visit Scheduled Follow Up"),
	PRE_VISIT_SCHEDULED_DROP("Pre Visit Scheduled Drop"),

	POST_VISIT_DROP("Post Visit Drop"),
	POST_VISIT_FOLLOW_UP("Post Visit Follow Up"),
	POST_VISIT_FOLLOW_UP_COMPLETED("Post Visit Follow Up Completed");
	
	private String statusDescription;
}
