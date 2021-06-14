package com.stanzaliving.core.far.enums;

public enum CartStatus {
    IN_PROGRESS("In Progress"), COMPLETED("Completed");

    private String label;

    CartStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}