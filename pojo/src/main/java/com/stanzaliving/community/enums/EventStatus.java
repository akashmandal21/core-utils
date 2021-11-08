package com.stanzaliving.community.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EventStatus {

    IN_DRAFT("IN_DRAFT"),
    PENDING_APPROVAL("PENDING_APPROVAL"),
    APPROVED("APPROVED"),
    REJECTED("REJECTED"),
    INACTIVE("INACTIVE"),
    LIVE("LIVE"),
    COMPLETED("COMPLETED");

    private final String name;

}
