package com.stanzaliving.core.far.enums;

public enum QrCodeStatus {
    UNUSED("Unused"), RESERVED("Reserved"), ASSIGNED("Assigned"), REPLACED("Replaced"), DISCARDED("Discarded"), INVALID("Invalid");

    private String label;

    QrCodeStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}