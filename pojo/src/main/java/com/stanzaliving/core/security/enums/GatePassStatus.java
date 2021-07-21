package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum GatePassStatus {
    LUGGAGE_ALLOWED("LUGGAGE_ALLOWED"),
    LUGGAGE_NOT_ALLOWED("LUGGAGE_NOT_ALLOWED");

    public final String label;

    GatePassStatus(String label) {
        this.label = label;
    }
}
