package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum PhoneType {
    FEATURE_PHONE("Feature-phone"),
    SMART_PHONE("Smart-phone");

    private final String label;

    PhoneType(String label) {
        this.label = label;
    }
}
