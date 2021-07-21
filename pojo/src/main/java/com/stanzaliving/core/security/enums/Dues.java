package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum Dues {
    NO_DUES("NO_DUES"),
    DUES_PENDING("DUES_PENDING");

    private final String label;

    private Dues(String label){
        this.label = label;
    }
}
