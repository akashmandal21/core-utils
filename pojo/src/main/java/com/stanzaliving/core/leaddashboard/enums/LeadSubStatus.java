package com.stanzaliving.core.leaddashboard.enums;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LeadSubStatus {

	NEW_LEAD("New Lead","#6D7278"),
	CALLED("Called","#F45E58"),
	CONNECTED("Connected","#F45E58"),
	QUALIFIED("Qualified","#6236FF"),
	PRE_QUALIFICATION_FOLLOW_UP("Pre Qualification Follow Up","#44D7B6"),
	RNR("RNR","#32C5FF"),
	
	BOOKED("Booked", "#6DD400"),
	DISQUALIFIED("Disqualified","#FA6400"),

	PRE_VISIT_FOLLOW_UP("Pre Visit Follow Up","#F45E58"),
	PRE_VISIT_SCHEDULED_FOLLOW_UP("Pre Visit 1 Scheduled Follow Up","#EEC583"),
	
	PRE_VISIT_SCHEDULED_DROP("Pre-Visit  Scheduled Drop","#E02020"),
	PRE_VISIT_DROP("Pre-Visit Drop", "#E02020"),
	
	VISIT_1_STARTED("Visit 1 Started","#EC9797"),
	VISIT_1_SCHEDULED("Visit 1 Scheduled","#F7B500"),
	VISIT_1_COMPLETED("Visit 1 Completed","#EEC583"),
	POST_VISIT_1_DROP("Post Visit 1 Drop","#E02020"),
	POST_VISIT_1_FOLLOW_UP("Post Visit 1 Follow Up","#0091FF"),
	POST_VISIT_1_FOLLOW_UP_COMPLETED("Post Visit 1 Follow Up Completed","#EEC583"),
	
	VISIT_2_STARTED("Visit 2 Started","#EC9797"),
	VISIT_2_SCHEDULED("Visit 2 Scheduled","#B620E0"),
	VISIT_2_COMPLETED("Visit 2 Completed","#EEC583"),
	POST_VISIT_2_DROP("Post Visit 2 Drop","#E02020"),
	POST_VISIT_2_FOLLOW_UP("Post Visit 2 Follow Up","#0091FF"),
	POST_VISIT_2_FOLLOW_UP_COMPLETED("Post Visit 2 Follow Up Completed","#50514F"),
	
	VISIT_3_STARTED("Visit 3 Started","#EC9797"),
	VISIT_3_SCHEDULED("Visit 3 Scheduled","#B620E0"),
	VISIT_3_COMPLETED("Visit 3 Completed","#EEC583"),
	POST_VISIT_3_DROP("Post Visit 3 Drop","#E02020"),
	POST_VISIT_3_FOLLOW_UP("Post Visit 3 Follow Up","#0091FF"),
	POST_VISIT_3_FOLLOW_UP_COMPLETED("Post Visit 3 Follow Up Completed","#50514F"),
	
	VISIT_4_STARTED("Visit 4 Started","#EC9797"),
	VISIT_4_SCHEDULED("Visit 4 Scheduled","#B620E0"),
	VISIT_4_COMPLETED("Visit 4 Completed","#EEC583"),
	POST_VISIT_4_DROP("Post Visit 4 Drop","#E02020"),
	POST_VISIT_4_FOLLOW_UP("Post Visit 4 Follow Up","#0091FF"),
	POST_VISIT_4_FOLLOW_UP_COMPLETED("Post Visit 4 Follow Up Completed","#50514F"),
	
	VISIT_5_STARTED("Visit 5 Started","#EC9797"),
	VISIT_5_SCHEDULED("Visit 5 Scheduled","#B620E0"),
	VISIT_5_COMPLETED("Visit 5 Completed","#EEC583"),
	POST_VISIT_5_DROP("Post Visit 5 Drop","#E02020"),
	POST_VISIT_5_FOLLOW_UP("Post Visit 5 Follow Up","#0091FF"),
	POST_VISIT_5_FOLLOW_UP_COMPLETED("Post Visit 5 Follow Up Completed","#50514F");
	
	private String statusDescription;
	private String colorCode;
	
	public static boolean postVisitFollowUpStatus(LeadSubStatus leadSubStatus) {
		Set<LeadSubStatus> postVisitFollowUpStatus = new HashSet<>();
		
		postVisitFollowUpStatus.add(POST_VISIT_1_FOLLOW_UP);
		postVisitFollowUpStatus.add(POST_VISIT_2_FOLLOW_UP);
		postVisitFollowUpStatus.add(POST_VISIT_3_FOLLOW_UP);
		postVisitFollowUpStatus.add(POST_VISIT_4_FOLLOW_UP);
		postVisitFollowUpStatus.add(POST_VISIT_5_FOLLOW_UP);
		
		return postVisitFollowUpStatus.contains(leadSubStatus);

	}
	
	public static boolean followUpVisitScheduledStatus(LeadSubStatus leadSubStatus) {
		
		Set<LeadSubStatus> followUpVisitScheduledStatus = new HashSet<>();
		
		followUpVisitScheduledStatus.add(VISIT_2_SCHEDULED);
		followUpVisitScheduledStatus.add(VISIT_3_SCHEDULED);
		followUpVisitScheduledStatus.add(VISIT_4_SCHEDULED);
		followUpVisitScheduledStatus.add(VISIT_5_SCHEDULED);
		
		return followUpVisitScheduledStatus.contains(leadSubStatus);
	}

	public static boolean visitToBeScheduledStatus(LeadSubStatus leadSubStatus) {
		
		Set<LeadSubStatus> visitToBeScheduled = new HashSet<>();
		
		visitToBeScheduled.add(QUALIFIED);
		visitToBeScheduled.add(PRE_VISIT_SCHEDULED_FOLLOW_UP);
		
		return visitToBeScheduled.contains(leadSubStatus);
	}
	
	public static boolean visitOneScheduled(LeadSubStatus leadSubStatus) {
		
		Set<LeadSubStatus> visitOneSchedule = new HashSet<>();
		
		visitOneSchedule.add(PRE_VISIT_FOLLOW_UP);
		visitOneSchedule.add(VISIT_1_SCHEDULED);
		
		return visitOneSchedule.contains(leadSubStatus);
	}
	
	public static boolean visitStarted(LeadSubStatus leadSubStatus) {
		
		Set<LeadSubStatus> visitStarted = new HashSet<>();
		
		visitStarted.add(VISIT_1_STARTED);
		visitStarted.add(VISIT_2_STARTED);
		visitStarted.add(VISIT_3_STARTED);
		visitStarted.add(VISIT_4_STARTED);
		visitStarted.add(VISIT_5_STARTED);
		
		return visitStarted.contains(leadSubStatus);
	}
	
	public static Map<LeadSubStatus, String> pieChartStatuses() {
		
		Map<LeadSubStatus, String> pieChartStatus = new LinkedHashMap<>();
		
		pieChartStatus.put(LeadSubStatus.NEW_LEAD, "New Leads");
		pieChartStatus.put(LeadSubStatus.RNR, "RNR");
		pieChartStatus.put(LeadSubStatus.DISQUALIFIED, "Disqualified");
		pieChartStatus.put(LeadSubStatus.PRE_QUALIFICATION_FOLLOW_UP, "Prequalification Follow Up Needed");
		pieChartStatus.put(LeadSubStatus.QUALIFIED, "Visit to be scheduled");
		pieChartStatus.put(LeadSubStatus.VISIT_1_SCHEDULED, "Visit 1 Scheduled");
		pieChartStatus.put(LeadSubStatus.VISIT_1_STARTED, "Visit Started");
		pieChartStatus.put(LeadSubStatus.VISIT_2_SCHEDULED, "Follow Up Visit Scheduled");
		pieChartStatus.put(LeadSubStatus.POST_VISIT_1_FOLLOW_UP, "Post Visit Follow Up Needed");
		pieChartStatus.put(LeadSubStatus.BOOKED, "Booked");
		pieChartStatus.put(LeadSubStatus.POST_VISIT_1_DROP, "Dropped");

		return pieChartStatus;
	}
	
	public static LeadSubStatus visitCompletedEventPublish(LeadSubStatus leadSubStatus) {
		
		Map<LeadSubStatus, LeadSubStatus> visitCompleted = new HashMap<>();
		
		visitCompleted.put(VISIT_2_SCHEDULED, VISIT_1_COMPLETED);
		visitCompleted.put(VISIT_3_SCHEDULED, VISIT_2_COMPLETED);
		visitCompleted.put(VISIT_4_SCHEDULED, VISIT_3_COMPLETED);
		visitCompleted.put(VISIT_5_SCHEDULED, VISIT_4_COMPLETED);
		visitCompleted.put(POST_VISIT_1_FOLLOW_UP, VISIT_1_COMPLETED);
		visitCompleted.put(POST_VISIT_2_FOLLOW_UP, VISIT_2_COMPLETED);
		visitCompleted.put(POST_VISIT_3_FOLLOW_UP, VISIT_3_COMPLETED);
		visitCompleted.put(POST_VISIT_4_FOLLOW_UP, VISIT_4_COMPLETED);
		visitCompleted.put(POST_VISIT_5_FOLLOW_UP, VISIT_5_COMPLETED);
		
		return visitCompleted.get(leadSubStatus);
	}
	
	public static boolean dropped(LeadSubStatus leadSubStatus) {
		
		Set<LeadSubStatus> dropped = new HashSet<>();
		
		dropped.add(DISQUALIFIED);
		dropped.add(PRE_VISIT_DROP);
		dropped.add(POST_VISIT_1_DROP);
		dropped.add(POST_VISIT_2_DROP);
		dropped.add(POST_VISIT_3_DROP);
		dropped.add(POST_VISIT_4_DROP);
		dropped.add(POST_VISIT_5_DROP);
	
		return dropped.contains(leadSubStatus);
	}
	
	public static boolean postVisitDropStatus(LeadSubStatus leadSubStatus) {
		Set<LeadSubStatus> postVisitDropStatus = new HashSet<>();
		
		postVisitDropStatus.add(POST_VISIT_1_DROP);
		postVisitDropStatus.add(POST_VISIT_2_DROP);
		postVisitDropStatus.add(POST_VISIT_3_DROP);
		postVisitDropStatus.add(POST_VISIT_4_DROP);
		postVisitDropStatus.add(POST_VISIT_5_DROP);
		
		return postVisitDropStatus.contains(leadSubStatus);

	}
}
