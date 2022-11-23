package com.stanzaliving.complaint.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

@Getter
public enum EnumComplaintStatus {

	ALL(1, "All"),
	OPEN(2, "Open"),
	PENDING(3, "Pending"),
	RESOLVED(4, "Resolved"),
	CLOSED(5, "Closed"),
	WAITING_ON_CUSTOMER(6, "Waiting on Customer"),
	PENDING_WITH_GROUND_OPS(7, "Pending with Ground Ops"),
	HOLD(9, "Hold"),
	IN_PROGRESS(10, "In Progress"),
	REOPEN(11, "Reopen"),
	MERGED(12, "Merged"),
	PENDING_WITH_SALES_MARKETING_TEAM(13, "Pending with Sales/ Marketing Team"),
	PENDING_WITH_PROJECTS_TEAM(14, "Pending with Projects Team"),
	PENDING_WITH_TECH_TEAM(15, "Pending with Tech Team"),
	PENDING_WITH_SALES_OPS(16, "Pending with Sales Ops"),
	PENDING_WITH_FINANCE_TEAM(17, "Pending with Legal Team"),
	PENDING_WITH_LEGAL_TEAM(18, "Pending with Finance Team");

	private Integer statusId;
	private String status;

	private static final Map<Integer, EnumComplaintStatus> byStatus = new HashMap<Integer, EnumComplaintStatus>();
	private static final Map<String, EnumComplaintStatus> byStatusName = new HashMap<String, EnumComplaintStatus>();
	static {
		for (EnumComplaintStatus e : EnumComplaintStatus.values()) {
			byStatus.put(e.getStatusId(), e);
			byStatusName.put(e.getStatus(), e);
		}
	}

	public static EnumComplaintStatus getByStatusId(Integer statusId) {
		return byStatus.get(statusId);
	}

	public static EnumComplaintStatus getByStatus(String status) {
		return byStatusName.get(status);
	}

	private EnumComplaintStatus(Integer statusId, String status) {
		this.statusId = statusId;
		this.status = status;
	}

}
