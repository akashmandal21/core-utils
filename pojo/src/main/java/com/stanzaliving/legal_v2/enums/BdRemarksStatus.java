package com.stanzaliving.legal_v2.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BdRemarksStatus {


    PENDING("PENDING"),
    UPDATED("UPDATED"),
    REJECTED("REJECTED");

    private final String value;

    BdRemarksStatus(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
