package com.stanzaliving.core.estate.enums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * SOW Status enum.
 * @author debendra.dhinda
 * @since 06-Jan-2020
 *
 **/
@Getter
@AllArgsConstructor
public enum SOWStatus {

	PENDING_SOW_APPROVAL("Pending SOW Approval"), SOW_SENT_BACK("SOW Sent Back"), SOW_APPROVED("SOW Approved"),
	PENDING_SANDEEP_APPROVAL("Pending Sandeep Approval"), SENT_BACK_BY_SANDEEP("Sent Back by Sandeep");

	public static final List<SOWStatus> NON_MODIFIABLE_SOW_STATUS;

	private String status;

	private static Map<SOWStatus, String> SOWStatusMap = new HashMap<>();

	static {
		SOWStatusMap.put(PENDING_SOW_APPROVAL, SOWStatus.PENDING_SOW_APPROVAL.getStatus());
		SOWStatusMap.put(SOW_APPROVED, SOWStatus.SOW_APPROVED.getStatus());
		SOWStatusMap.put(SOW_SENT_BACK, SOWStatus.SOW_SENT_BACK.getStatus());

		NON_MODIFIABLE_SOW_STATUS = Arrays.asList(PENDING_SOW_APPROVAL, SOW_APPROVED, SOW_SENT_BACK);
	}


	public static Map<SOWStatus, String> getAll() {
		return SOWStatusMap;
	}

}