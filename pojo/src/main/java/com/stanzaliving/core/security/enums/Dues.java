package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum Dues {
    NO_DUES("No Dues"),
    DUES_PENDING("Dues Pending");

    private final String label;

    private Dues(String label){
        this.label = label;
    }
}
