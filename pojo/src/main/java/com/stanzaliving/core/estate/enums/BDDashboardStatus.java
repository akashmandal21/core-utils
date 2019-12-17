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

	UNDER_DRAFT("Under Draft", Arrays.asList(EstateStatus.DRAFT_IN_PROGRESS,EstateStatus.APPROVED_BY_CITY_HEAD,EstateStatus.SENT_BACK)),
	PENDING_ANDY_APPROVAL("Pending Andy Approval", Arrays.asList(EstateStatus.SHORTLISTED)),
	REJECTED("Rejected", Arrays.asList(EstateStatus.REJECTED,EstateStatus.REJECTED_BY_CITY_HEAD)),
	PENDING_RM_APPROVAL("Pending RM Approval", Arrays.asList(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD)),
	PENDING_NATIONAL_HEAD_APPROVAL("Pending National Head Approval", Arrays.asList(EstateStatus.SENT_FOR_APPROVAL));
	
	private String status;
	
	private List<EstateStatus> estateStatuses;

	public static Map<EstateStatus, BDDashboardStatus> statusMap = new HashMap<EstateStatus, BDDashboardStatus>(BDDashboardStatus.values().length);
	
	static {
		
		statusMap.put(EstateStatus.DRAFT_IN_PROGRESS, UNDER_DRAFT);
		statusMap.put(EstateStatus.APPROVED_BY_CITY_HEAD, UNDER_DRAFT);
		statusMap.put(EstateStatus.SENT_BACK, UNDER_DRAFT);
		statusMap.put(EstateStatus.SHORTLISTED, PENDING_ANDY_APPROVAL);
		statusMap.put(EstateStatus.REJECTED, REJECTED);
		statusMap.put(EstateStatus.REJECTED_BY_CITY_HEAD, REJECTED);
		statusMap.put(EstateStatus.SENT_FOR_APPROVAL_TO_CITY_HEAD, PENDING_RM_APPROVAL);
		statusMap.put(EstateStatus.SENT_FOR_APPROVAL, PENDING_NATIONAL_HEAD_APPROVAL);
	}
}
