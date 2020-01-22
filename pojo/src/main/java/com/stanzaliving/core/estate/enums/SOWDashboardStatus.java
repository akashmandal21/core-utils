package com.stanzaliving.core.estate.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SOWDashboardStatus {

	PENDING_SOW_APPROVAL("Pending SOW Approval", SOWStatus.PENDING_SOW_APPROVAL, "#DC3913"),
	SOW_SENT_BACK("SOW Sent Back", SOWStatus.SOW_SENT_BACK, "#FF9902"),
	SOW_APPROVED("SOW Approved", SOWStatus.SOW_APPROVED, "#3366CC");

	private String status;

	private SOWStatus sowStatus;

	private String color;

	public static  Map<SOWStatus, SOWDashboardStatus> statusMap = new HashMap<>(SOWDashboardStatus.values().length);

	static {

		statusMap.put(SOWStatus.PENDING_SOW_APPROVAL, PENDING_SOW_APPROVAL);
		statusMap.put(SOWStatus.SOW_SENT_BACK, SOW_SENT_BACK);
		statusMap.put(SOWStatus.SOW_APPROVED, SOW_APPROVED);

	}
}
