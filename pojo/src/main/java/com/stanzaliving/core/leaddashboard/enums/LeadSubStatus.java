package com.stanzaliving.core.leaddashboard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LeadSubStatus {

	NEW_LEAD("New Lead","#F45E58"),
	CALLED("Called","#F45E58"),
	CONNECTED("Connected","#F45E58"),
	QUALIFIED("Qualified","#F45E58"),
	PRE_QUALIFICATION_FOLLOW_UP("Pre Qualification Follow Up","#F45E58"),
	RNR("RNR","#50514F"),
	
	DISQUALIFIED("Disqualified","#F45E58"),

	PRE_VISIT_FOLLOW_UP("Pre Visit Follow Up","#F45E58"),
	PRE_VISIT_SCHEDULED_FOLLOW_UP("Pre Visit 1 Scheduled Follow Up","#EEC583"),
	PRE_VISIT_SCHEDULED_DROP("Pre Visit  Scheduled Drop","#EEC583"),

	POST_VISIT_1_DROP("Post Visit 1 Drop","#EEC583"),
	POST_VISIT_1_FOLLOW_UP("Post Visit 1 Follow Up","#EEC583"),
	POST_VISIT_1_FOLLOW_UP_COMPLETED("Post Visit 1 Follow Up Completed","#EEC583"),
	

	POST_VISIT_2_DROP("Post Visit 2 Drop","#50514F"),
	POST_VISIT_2_FOLLOW_UP("Post Visit 2 Follow Up","#50514F"),
	POST_VISIT_2_FOLLOW_UP_COMPLETED("Post Visit 2 Follow Up Completed","#50514F");
	
	private String statusDescription;
	private String colorCode;
}
