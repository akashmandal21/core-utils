package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ReminderActionType {
    RESOLUTION_TIME("resolution time"),
    FIRST_RESPONSE_TIME("first response time");
    private final String name;
}
