package com.stanzaliving.core.security.enums;

public enum ActionStatus {
    ACTION_TAKEN("Action-taken"),
    PENDING("Pending");

    public final String label;

    private ActionStatus(String label) {
        this.label = label;
    }
}
