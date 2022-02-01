package com.stanzaliving.community.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EventStatus {

    IN_DRAFT("IN_DRAFT", "Draft"),
    PENDING_APPROVAL("PENDING_APPROVAL", "Pending Approval"),
    APPROVED("APPROVED", "Approved"),
    REJECTED("REJECTED", "Rejected"),
    INACTIVE("INACTIVE", "Inactive"),
    LIVE("LIVE", "Live"),
    COMPLETED("COMPLETED", "Completed");

	private final String name;
	private final String displayName;
}
