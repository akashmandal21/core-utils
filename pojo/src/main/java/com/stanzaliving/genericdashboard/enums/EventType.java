package com.stanzaliving.genericdashboard.enums;

public enum EventType {
    DONE_BY_USERS("DONE_BY_USERS"),
    NOT_DONE_BY_USERS("NOT_DONE_BY_USERS");

    public String eventType;

    EventType(String eventType) {
        this.eventType = eventType;
    }
}
