package com.stanzaliving.core.leaddashboard.enums;

import java.util.HashSet;
import java.util.Set;

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

	MOVED_OUT("Moved Out"),
	BOOKED("Booked");
	
	private final String statusDescription;
	
	public static boolean isLeadQualified(LeadStatus leadStatus) {
		Set<LeadStatus> leadStatuses = new HashSet<>();
		
		leadStatuses.add(QUALIFIED);
		leadStatuses.add(DROPPED);
		leadStatuses.add(VISIT_SCHEDULED);
		leadStatuses.add(VISIT_STARTED);
		leadStatuses.add(VISIT_COMPLETED);
		leadStatuses.add(BOOKED);
		
		return leadStatuses.contains(leadStatus);
	}


	
	public static boolean isVisitScheduled(LeadStatus leadStatus) {
		Set<LeadStatus> leadStatuses = new HashSet<>();
		
		leadStatuses.add(VISIT_SCHEDULED);
		leadStatuses.add(VISIT_STARTED);
		leadStatuses.add(VISIT_COMPLETED);
		leadStatuses.add(BOOKED);
		
		return leadStatuses.contains(leadStatus);
	}
	
	public static boolean isVisitCompleted(LeadStatus leadStatus) {
		Set<LeadStatus> leadStatuses = new HashSet<>();
		
		leadStatuses.add(VISIT_COMPLETED);
		leadStatuses.add(BOOKED);
		
		return leadStatuses.contains(leadStatus);
	}
	public static boolean isLeadRevivalAllowed(LeadStatus leadStatus) {
		Set<LeadStatus> leadStatuses = new HashSet<>();
		leadStatuses.add(DISQUALIFIED);
		leadStatuses.add(DROPPED);
		leadStatuses.add(MOVED_OUT);

		return leadStatuses.contains(leadStatus);
	}
}
