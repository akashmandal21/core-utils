/**
 * 
 */
package com.stanzaliving.core.leaddashboard.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
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
	PRE_QUALIFICATION_FOLLOW_UP("Pre Qualification Follow-Up"),

	QUALIFIED("Qualified"),
	PRE_VISIT_SCHEDULED_FOLLOW_UP("Pre Visit Scheduled Follow-Up"),

	DISQUALIFIED("Disqualified"),
	
	
	PRE_VISIT_SCHEDULED_DROP("Pre Visit Scheduled Drop"),
	POST_VISIT_SCHEDULED_FOLLOW_UP("Post Visit Scheduled Follow-Up"),
	POST_VISIT_SCHEDULED_DROP("Post Visit Scheduled Drop"),

	POST_VISIT_SCHEDULED_FOLLOW_UP_COMPLETED("Post Visit Scheduled Follow-Up Completed"),
	
	BOOKED("Booked"),
	DROPPED("Dropped"),
	
	PRE_VISIT_FOLLOW_UP("Pre Visit Follow-Up"),
	PRE_VISIT_DROP("Pre Visit Drop"),

	VISIT_1_STARTED("Visit 1 Started"),
	VISIT_1_SCHEDULED("Visit 1 Scheduled"),
	VISIT_1_COMPLETED("Visit 1 Completed"),
	POST_VISIT_1_DROP("Post Visit 1 Drop"),
	POST_VISIT_1_FOLLOW_UP("Post Visit 1 Follow-Up"),
	POST_VISIT_1_FOLLOW_UP_COMPLETED("Post Visit 1 Follow-Up Completed"),
	
	
	VISIT_2_STARTED("Visit 2 Started"),
	VISIT_2_SCHEDULED("Visit 2 Scheduled"),
	VISIT_2_COMPLETED("Visit 2 Completed"),
	POST_VISIT_2_DROP("Post Visit 2 Drop"),
	POST_VISIT_2_FOLLOW_UP("Post Visit 2 Follow-Up"),
	POST_VISIT_2_FOLLOW_UP_COMPLETED("Post Visit 2 Follow-Up Completed"),
	
	VISIT_3_STARTED("Visit 3 Started"),
	VISIT_3_SCHEDULED("Visit 3 Scheduled"),
	VISIT_3_COMPLETED("Visit 3 Completed"),
	POST_VISIT_3_DROP("Post Visit 3 Drop"),
	POST_VISIT_3_FOLLOW_UP("Post Visit 3 Follow-Up"),
	POST_VISIT_3_FOLLOW_UP_COMPLETED("Post Visit 3 Follow-Up Completed"),
	
	VISIT_4_STARTED("Visit 4 Started"),
	VISIT_4_SCHEDULED("Visit 4 Scheduled"),
	VISIT_4_COMPLETED("Visit 4 Completed"),
	POST_VISIT_4_DROP("Post Visit 4 Drop"),
	POST_VISIT_4_FOLLOW_UP("Post Visit 4 Follow-Up"),
	POST_VISIT_4_FOLLOW_UP_COMPLETED("Post Visit 4 Follow-Up Completed"),
	
	VISIT_5_STARTED("Visit 5 Started"),
	VISIT_5_SCHEDULED("Visit 5 Scheduled"),
	VISIT_5_COMPLETED("Visit 5 Completed"),
	POST_VISIT_5_DROP("Post Visit 5 Drop"),
	POST_VISIT_5_FOLLOW_UP("Post Visit 5 Follow-Up"),
	POST_VISIT_5_FOLLOW_UP_COMPLETED("Post Visit 5 Follow-Up Completed"),
	ALL("ALL"),// new status only used for whatsapp template

	
	VISIT_INTENT("Visit Intent Shown");
	
	private String statusName;
	

	public static boolean visitCompleted(TimelineStatusEnum timelineStatus) {
		
		Set<TimelineStatusEnum> visitCompleted = new HashSet<>();
		
		visitCompleted.add(VISIT_1_COMPLETED);
		visitCompleted.add(VISIT_2_COMPLETED);
		visitCompleted.add(VISIT_3_COMPLETED);
		visitCompleted.add(VISIT_4_COMPLETED);
		visitCompleted.add(VISIT_5_COMPLETED);
	
	    return visitCompleted.contains(timelineStatus);
	}
	
	public static boolean postVisitDrop(TimelineStatusEnum timelineStatus) {
		
		Set<TimelineStatusEnum> postVisitDrop = new HashSet<>();
		
		postVisitDrop.add(POST_VISIT_1_DROP);
		postVisitDrop.add(POST_VISIT_2_DROP);
		postVisitDrop.add(POST_VISIT_3_DROP);
		postVisitDrop.add(POST_VISIT_4_DROP);
		postVisitDrop.add(POST_VISIT_5_DROP);
	
	    return postVisitDrop.contains(timelineStatus);
	}
	
	public static List<TimelineStatusEnum> getVisitHistoryStatuses() {
		
		List<TimelineStatusEnum> visitHistoryStatuses = new ArrayList<>();
		
		visitHistoryStatuses.add(VISIT_1_SCHEDULED);
		visitHistoryStatuses.add(VISIT_2_SCHEDULED);
		visitHistoryStatuses.add(VISIT_3_SCHEDULED);
		visitHistoryStatuses.add(VISIT_4_SCHEDULED);
		visitHistoryStatuses.add(VISIT_5_SCHEDULED);
	
		visitHistoryStatuses.add(VISIT_1_COMPLETED);
		visitHistoryStatuses.add(VISIT_2_COMPLETED);
		visitHistoryStatuses.add(VISIT_3_COMPLETED);
		visitHistoryStatuses.add(VISIT_4_COMPLETED);
		visitHistoryStatuses.add(VISIT_5_COMPLETED);
		
		return visitHistoryStatuses;
	}
	
	public static int getVisitScheduleCompletedCount(TimelineStatusEnum status) {
		
		Map<TimelineStatusEnum, Integer> visitHistoryStatusCount = new HashMap<>();
		
		visitHistoryStatusCount.put(VISIT_1_SCHEDULED, 1);
		visitHistoryStatusCount.put(VISIT_2_SCHEDULED, 2);
		visitHistoryStatusCount.put(VISIT_3_SCHEDULED, 3);
		visitHistoryStatusCount.put(VISIT_4_SCHEDULED, 4);
		visitHistoryStatusCount.put(VISIT_5_SCHEDULED, 5);
	
		visitHistoryStatusCount.put(VISIT_1_COMPLETED, 1);
		visitHistoryStatusCount.put(VISIT_2_COMPLETED, 2);
		visitHistoryStatusCount.put(VISIT_3_COMPLETED, 3);
		visitHistoryStatusCount.put(VISIT_4_COMPLETED, 4);
		visitHistoryStatusCount.put(VISIT_5_COMPLETED, 5);
		
		return visitHistoryStatusCount.get(status);
	}
	
	public static List<TimelineStatusEnum> getVisitScheduleList() {

		List<TimelineStatusEnum> visitScheduledList = new ArrayList();

		visitScheduledList.add(VISIT_1_SCHEDULED);
		visitScheduledList.add(VISIT_2_SCHEDULED);
		visitScheduledList.add(VISIT_3_SCHEDULED);
		visitScheduledList.add(VISIT_4_SCHEDULED);
		visitScheduledList.add(VISIT_5_SCHEDULED);

		return visitScheduledList;
	}
}
