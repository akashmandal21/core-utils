package com.stanzaliving.core.far.enums;

public enum FarActionType {
    HOTO("Hoto"), TRANSFER_IN("Transfer In"), TRANSFER_OUT("Transfer Out");

    private String label;

    FarActionType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}