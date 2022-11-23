package com.stanzaliving.core.complaint.enums;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EnumComplaintSource {

	EMAIL(1, "Email"),
	PORTAL(2, "Portal"),
	PHONE(3, "Phone"),
	CHAT(7, "Chat"),
	MOBILEIP(8, "MobileIp"),
	FEEDBACK_WIDGET(9, "Feedback Widget"),
	OUTBOUND_EMAIL(10, "Outbound Email");

	private Integer sourceId;
	private String source;

	private static final Map<Integer, EnumComplaintSource> bySource = new HashMap<>();

	static {
		for (EnumComplaintSource e : EnumComplaintSource.values()) {
			bySource.put(e.getSourceId(), e);
		}
	}

	public static EnumComplaintSource getBySourceId(Integer sourceId) {
		return bySource.get(sourceId);
	}

}