package com.stanzaliving.core.far.enums;

public enum HotoStatus {
    HOTO_PENDING("HOTO Pending"), HOTO_INPROGRESS("HOTO In Progress"), HOTO_REJECTED("HOTO Rejected"), HOTO_DONE("HOTO Done");

    private String label;

    HotoStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}