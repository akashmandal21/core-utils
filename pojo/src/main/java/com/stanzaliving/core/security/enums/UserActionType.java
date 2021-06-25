package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum UserActionType {
    RESIDENT_ACTION("Resident-action"),
    RC_ACTION("RC-action"),
    QRT_ACTION("QRT-action"),
    NODAL_ACTION("Nodal-action"),
    OTHER("Other");

    public final String label;

    UserActionType(String label) {
        this.label = label;
    }
}
