package com.stanzaliving.core.estate.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Getter;

/**
 * SOW Status enum.
 * @author debendra.dhinda
 * @since 06-Jan-2020
 *
 **/
@Getter
public enum SOWStatus {

	PENDING_SOW_APPROVAL("Pending SOW Approval"), SOW_SENT_BACK("SOW Sent Back"), SOW_APPROVED("SOW Approved");

	public static final List<SOWStatus> NON_MODIFIABLE_SOW_STATUS;

	private String name;

	private static Map<SOWStatus, String> SOWStatusMap = new HashMap<>();

	static {
		SOWStatusMap.put(PENDING_SOW_APPROVAL, SOWStatus.PENDING_SOW_APPROVAL.getName());
		SOWStatusMap.put(SOW_APPROVED, SOWStatus.SOW_APPROVED.getName());
		SOWStatusMap.put(SOW_SENT_BACK, SOWStatus.SOW_SENT_BACK.getName());

		NON_MODIFIABLE_SOW_STATUS = Arrays.asList(PENDING_SOW_APPROVAL, SOW_APPROVED, SOW_SENT_BACK);
	}

	private SOWStatus(String name) {
		this.name = name;
	}

	public static Map<SOWStatus, String> getAll() {
		return SOWStatusMap;
	}

}