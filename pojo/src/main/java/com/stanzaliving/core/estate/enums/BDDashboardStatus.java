package com.stanzaliving.core.estate.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BDDashboardStatus {

	UNDER_DRAFT("Under Draft", Arrays.asList(EstateStatus.DRAFT_IN_PROGRESS,EstateStatus.APPROVED_BY_CITY_HEAD,EstateStatus.SENT_BACK,EstateStatus.SENT_BACK_BY_CITY_HEAD,EstateStatus.SENT_BACK_BY_LEADERSHIP),"#990199"),
	PENDING_ANDY_APPROVAL("Pending Andy Approval", Arrays.asList(EstateStatus.SHORTLISTED),"#000000"),
	REJECTED("Rejected", Arrays.asList(EstateStatus.REJECTED,EstateStatus.REJECTED_BY_CITY_HEAD),"#DC3913"),
	PENDING_RM_APPROVAL("Pending RM Approval", Arrays.asList(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD),"#FF9902"),
	PENDING_NATIONAL_HEAD_APPROVAL("Pending National Head Approval", Arrays.asList(EstateStatus.SENT_FOR_APPROVAL),"#3366CC"),
	PROPERTY_NAMING_DONE("Property Naming Done",Arrays.asList(EstateStatus.APPROVED_BY_LEADERSHIP),"#00FF00");
	
	private String status;
	
	private List<EstateStatus> estateStatuses;
	
	private String color;

	public static Map<EstateStatus, BDDashboardStatus> statusMap = new HashMap<EstateStatus, BDDashboardStatus>(BDDashboardStatus.values().length);
	
	static {
		
		statusMap.put(EstateStatus.DRAFT_IN_PROGRESS, UNDER_DRAFT);
		statusMap.put(EstateStatus.APPROVED_BY_CITY_HEAD, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_LEADERSHIP, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK_BY_CITY_HEAD, UNDER_DRAFT);
		statusMap.put(EstateStatus.SHORTLISTED, PENDING_ANDY_APPROVAL);
		statusMap.put(EstateStatus.REJECTED, REJECTED);
		statusMap.put(EstateStatus.REJECTED_BY_CITY_HEAD, REJECTED);
		statusMap.put(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD, PENDING_RM_APPROVAL);
		statusMap.put(EstateStatus.SENT_FOR_APPROVAL, PENDING_NATIONAL_HEAD_APPROVAL);
		statusMap.put(EstateStatus.APPROVED_BY_LEADERSHIP, PROPERTY_NAMING_DONE);
		
	}
}
