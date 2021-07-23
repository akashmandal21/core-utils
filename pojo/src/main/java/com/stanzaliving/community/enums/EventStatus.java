package com.stanzaliving.community.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EventStatus {

    IN_DRAFT("in_draft"),
    PENDING_APPROVAL("pending_approval"),
    APPROVED("approved"),
    REJECTED("rejected"),
    INACTIVE("inactive"),
    LIVE("live"),
    COMPLETED("completed");

    private final String name;

}
