package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum GatePassStatus {
    LUGGAGE_ALLOWED("Luggage allowed"),
    LUGGAGE_NOT_ALLOWED("Luggage not allowed");

    public final String label;

    GatePassStatus(String label) {
        this.label = label;
    }
}
