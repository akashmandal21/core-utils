/**
 * @author nipunaggarwal
 *
 */
package com.stanzaliving.core.complaint.enums;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumComplaintStatus {

	ALL(1, "All", EnumComplaintAlfredStatus.OPEN),
	OPEN(2, "Open", EnumComplaintAlfredStatus.OPEN),
	PENDING(3, "Pending", EnumComplaintAlfredStatus.IN_PROGRESS),
	RESOLVED(4, "Resolved", EnumComplaintAlfredStatus.RESOLVED),
	CLOSED(5, "Closed", EnumComplaintAlfredStatus.CLOSED),
	WAITING_ON_CUSTOMER(6, "Waiting on Customer", EnumComplaintAlfredStatus.WAITING_FOR_DETAILS),
	PENDING_WITH_GROUND_OPS(7, "Pending with Ground Ops", EnumComplaintAlfredStatus.IN_PROGRESS),
	HOLD(9, "Hold", EnumComplaintAlfredStatus.HOLD),
	IN_PROGRESS(10, "In Progress", EnumComplaintAlfredStatus.IN_PROGRESS),
	REOPEN(11, "Reopen", EnumComplaintAlfredStatus.REOPEN),
	MERGED(12, "Merged", EnumComplaintAlfredStatus.MERGED),
	PENDING_WITH_SALES_MARKETING_TEAM(13, "Pending with Sales/ Marketing Team", EnumComplaintAlfredStatus.IN_PROGRESS),
	PENDING_WITH_PROJECTS_TEAM(14, "Pending with Projects Team", EnumComplaintAlfredStatus.IN_PROGRESS),
	PENDING_WITH_TECH_TEAM(15, "Pending with Tech Team", EnumComplaintAlfredStatus.IN_PROGRESS),
	PENDING_WITH_SALES_OPS(16, "Pending with Sales Ops", EnumComplaintAlfredStatus.IN_PROGRESS),
	PENDING_WITH_FINANCE_TEAM(17, "Pending with Legal Team", EnumComplaintAlfredStatus.IN_PROGRESS),
	PENDING_WITH_LEGAL_TEAM(18, "Pending with Finance Team", EnumComplaintAlfredStatus.IN_PROGRESS),

	PENDING_WITH_BD_TEAM(19, "Pending with BD Team/ Landlord", EnumComplaintAlfredStatus.IN_PROGRESS),
	PENDING_ON_R_AND_M(20, "Pending on R&M", EnumComplaintAlfredStatus.IN_PROGRESS),
	PENDING_ON_RESIDENT(21, "Pending on Resident", EnumComplaintAlfredStatus.IN_PROGRESS);

	private Integer statusId;
	private String status;
	private EnumComplaintAlfredStatus alfredStatus;

	private static final Map<Integer, EnumComplaintStatus> byStatus = new HashMap<>();
	private static final Map<String, EnumComplaintStatus> byStatusName = new HashMap<>();
	private static final Set<EnumComplaintStatus> openComplaintStatuses = new HashSet<>();
	private static final Set<EnumComplaintStatus> closedComplaintStatuses = new HashSet<>();

	static {
		for (EnumComplaintStatus e : EnumComplaintStatus.values()) {
			byStatus.put(e.getStatusId(), e);
			byStatusName.put(e.getStatus(), e);
		}

		openComplaintStatuses.add(OPEN);
		openComplaintStatuses.add(PENDING);
		openComplaintStatuses.add(IN_PROGRESS);
		openComplaintStatuses.add(MERGED);
		openComplaintStatuses.add(WAITING_ON_CUSTOMER);
		openComplaintStatuses.add(REOPEN);
		openComplaintStatuses.add(HOLD);
		openComplaintStatuses.add(PENDING_WITH_GROUND_OPS);
		openComplaintStatuses.add(PENDING_WITH_PROJECTS_TEAM);
		openComplaintStatuses.add(PENDING_WITH_SALES_MARKETING_TEAM);
		openComplaintStatuses.add(PENDING_WITH_TECH_TEAM);
		openComplaintStatuses.add(PENDING_WITH_BD_TEAM);
		openComplaintStatuses.add(PENDING_ON_R_AND_M);
		openComplaintStatuses.add(PENDING_ON_RESIDENT);

		closedComplaintStatuses.add(CLOSED);
		closedComplaintStatuses.add(RESOLVED);

	}

	public static EnumComplaintStatus getByStatusId(Integer statusId) {
		return byStatus.get(statusId);
	}

	public static EnumComplaintStatus getByStatus(String status) {
		return byStatusName.get(status);
	}

	public static Set<EnumComplaintStatus> getOpenComplaintStatuses() {
		return openComplaintStatuses;
	}

	public static Set<EnumComplaintStatus> getClosedComplaintStatuses() {
		return closedComplaintStatuses;
	}

}