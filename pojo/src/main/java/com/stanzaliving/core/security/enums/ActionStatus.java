package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum ActionStatus {
    ACTION_TAKEN("Action taken"),
    ACTION_PENDING("Action pending"),
    ACTION_WINDOW_CLOSED("Window closed");

    private final String label;

    private ActionStatus(String label) {
        this.label = label;
    }
}
