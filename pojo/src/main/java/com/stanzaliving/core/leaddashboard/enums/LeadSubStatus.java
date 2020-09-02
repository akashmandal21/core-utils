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
	
	BOOKED("Booked", "#F45E58"),
	DISQUALIFIED("Disqualified","#F45E58"),

	PRE_VISIT_FOLLOW_UP("Pre Visit Follow Up","#F45E58"),
	PRE_VISIT_SCHEDULED_FOLLOW_UP("Pre Visit 1 Scheduled Follow Up","#EEC583"),
	
	PRE_VISIT_SCHEDULED_DROP("Pre-Visit  Scheduled Drop","#EEC583"),
	PRE_VISIT_DROP("Pre-Visit Drop", "#50514F"),
	
	VISIT_1_STARTED("Visit 1 Started","#EEC583"),
	VISIT_1_SCHEDULED("Visit 1 Scheduled","#EEC583"),
	VISIT_1_COMPLETED("Visit 1 Completed","#EEC583"),
	POST_VISIT_1_DROP("Post Visit 1 Drop","#EEC583"),
	POST_VISIT_1_FOLLOW_UP("Post Visit 1 Follow Up","#EEC583"),
	POST_VISIT_1_FOLLOW_UP_COMPLETED("Post Visit 1 Follow Up Completed","#EEC583"),
	
	VISIT_2_STARTED("Visit 2 Started","#EEC583"),
	VISIT_2_SCHEDULED("Visit 2 Scheduled","#EEC583"),
	VISIT_2_COMPLETED("Visit 2 Completed","#EEC583"),
	POST_VISIT_2_DROP("Post Visit 2 Drop","#50514F"),
	POST_VISIT_2_FOLLOW_UP("Post Visit 2 Follow Up","#50514F"),
	POST_VISIT_2_FOLLOW_UP_COMPLETED("Post Visit 2 Follow Up Completed","#50514F"),
	
	VISIT_3_STARTED("Visit 3 Started","#EEC583"),
	VISIT_3_SCHEDULED("Visit 3 Scheduled","#EEC583"),
	VISIT_3_COMPLETED("Visit 3 Completed","#EEC583"),
	POST_VISIT_3_DROP("Post Visit 3 Drop","#50514F"),
	POST_VISIT_3_FOLLOW_UP("Post Visit 3 Follow Up","#50514F"),
	POST_VISIT_3_FOLLOW_UP_COMPLETED("Post Visit 3 Follow Up Completed","#50514F"),
	
	VISIT_4_STARTED("Visit 4 Started","#EEC583"),
	VISIT_4_SCHEDULED("Visit 4 Scheduled","#EEC583"),
	VISIT_4_COMPLETED("Visit 4 Completed","#EEC583"),
	POST_VISIT_4_DROP("Post Visit 4 Drop","#50514F"),
	POST_VISIT_4_FOLLOW_UP("Post Visit 4 Follow Up","#50514F"),
	POST_VISIT_4_FOLLOW_UP_COMPLETED("Post Visit 4 Follow Up Completed","#50514F"),
	
	VISIT_5_STARTED("Visit 5 Started","#EEC583"),
	VISIT_5_SCHEDULED("Visit 5 Scheduled","#EEC583"),
	VISIT_5_COMPLETED("Visit 5 Completed","#EEC583"),
	POST_VISIT_5_DROP("Post Visit 5 Drop","#50514F"),
	POST_VISIT_5_FOLLOW_UP("Post Visit 5 Follow Up","#50514F"),
	POST_VISIT_5_FOLLOW_UP_COMPLETED("Post Visit 5 Follow Up Completed","#50514F");
	
	private String statusDescription;
	private String colorCode;
}
