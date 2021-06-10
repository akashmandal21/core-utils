package com.stanzaliving.core.security.enums;

public enum Dues {
    NO_DUES("No Dues"),
    DUES_PENDING("Dues Pending");

    public final String label;

    private Dues(String label){
        this.label = label;
    }
}
