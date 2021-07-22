package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum Dues {
    NO_DUES("No dues"),
    DUES_PENDING("Dues pending");

    private final String label;

    private Dues(String label){
        this.label = label;
    }
}
