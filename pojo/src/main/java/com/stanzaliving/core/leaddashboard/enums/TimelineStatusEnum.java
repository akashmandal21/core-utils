/**
 * 
 */
package com.stanzaliving.core.leaddashboard.enums;

import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author raj.kumar
 *
 */
@Getter
@AllArgsConstructor
public enum TimelineStatusEnum {

	NEW_LEAD("New Lead"),
	CALLED("Called"),
	CONNECTED("Connected"),
	RNR("RNR"),
	PRE_QUALIFICATION_FOLLOW_UP("Pre Qualification Follow Up"),

	QUALIFIED("Qualified"),
	PRE_VISIT_SCHEDULED_FOLLOW_UP("Pre Visit Scheduled Follow Up"),

	DISQUALIFIED("Disqualified"),
	
	
	PRE_VISIT_SCHEDULED_DROP("Pre Visit Scheduled Drop"),
	
	POST_VISIT_SCHEDULED_FOLLOW_UP("Post Visit Scheduled Follow Up"),
	POST_VISIT_SCHEDULED_DROP("Post Visit Scheduled Drop"),

	POST_VISIT_SCHEDULED_FOLLOW_UP_COMPLETED("Post Visit Scheduled Follow Up Completed"),
	
	BOOKED("Booked"),
	DROPPED("Dropped"),
	
	VISIT_STARTED("Visit Started"),
	VISIT_SCHEDULED("Visit Scheduled"),
	VISIT_COMPLETED("Visit Completed"),
	POST_VISIT_DROP("Post Visit Drop"),
	POST_VISIT_FOLLOW_UP("Post Visit Follow Up"),
	POST_VISIT_FOLLOW_UP_COMPLETED("Post Visit Follow Up Completed");
	
	
	private String currentLeadStatusName;
	
	public static Set<TimelineStatusEnum> countAssociatedWithStatus() {
		Set<TimelineStatusEnum> leadStatus = new HashSet<>();
		
		
		leadStatus.add(VISIT_STARTED);
		leadStatus.add(VISIT_SCHEDULED);
		leadStatus.add(VISIT_COMPLETED);
		leadStatus.add(POST_VISIT_DROP);
		leadStatus.add(POST_VISIT_FOLLOW_UP);
		leadStatus.add(POST_VISIT_FOLLOW_UP_COMPLETED);
		
		return leadStatus;
	}
}
