package com.stanzaliving.core.complaint.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumComplaintAlfredStatus {

	IN_PROGRESS("In Progress"),
	OPEN("Open"),
	RESOLVED("Resolved"),
	CLOSED("Closed"),
	WAITING_FOR_DETAILS("Waiting for Details"),
	HOLD("Hold"),
	REOPEN("Reopen"),
	MERGED("Merged");
	
	private String status;

	private static final Map<String, EnumComplaintAlfredStatus> byStatusName = new HashMap<String, EnumComplaintAlfredStatus>();
	static {
		for (EnumComplaintAlfredStatus e : EnumComplaintAlfredStatus.values()) {
			byStatusName.put(e.getStatus(), e);
		}
	}

	public static EnumComplaintAlfredStatus getByStatus(String status) {
		return byStatusName.get(status);
	}

	private EnumComplaintAlfredStatus(Integer statusId, String status) {
		this.status = status;
	}

}
