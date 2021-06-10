package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum ActionStatus {
    ACTION_TAKEN("Action-taken"),
    PENDING("Pending");

    private final String label;

    private ActionStatus(String label) {
        this.label = label;
    }
}
