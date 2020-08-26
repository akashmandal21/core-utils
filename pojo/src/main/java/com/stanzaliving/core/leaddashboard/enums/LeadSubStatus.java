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
	
	DISQUALIFIED("Disqualified"),

	PRE_VISIT_FOLLOW_UP("Pre Visit Follow Up"),
	PRE_VISIT_SCHEDULED_FOLLOW_UP("Pre Visit 1 Scheduled Follow Up"),
	PRE_VISIT_SCHEDULED_DROP("Pre Visit  Scheduled Drop"),

	POST_VISIT_1_DROP("Post Visit 1 Drop"),
	POST_VISIT_1_FOLLOW_UP("Post Visit 1 Follow Up"),
	POST_VISIT_1_FOLLOW_UP_COMPLETED("Post Visit 1 Follow Up Completed"),
	

	POST_VISIT_2_DROP("Post Visit 2 Drop"),
	POST_VISIT_2_FOLLOW_UP("Post Visit 2 Follow Up"),
	POST_VISIT_2_FOLLOW_UP_COMPLETED("Post Visit 2 Follow Up Completed");
	
	private String statusDescription;
}
