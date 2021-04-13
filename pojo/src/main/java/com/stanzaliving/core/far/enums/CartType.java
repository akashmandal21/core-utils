package com.stanzaliving.core.far.enums;

public enum CartType {
    TRANSFER_OUT("Transfer Out"), TRANSFER_IN("Transfer In"),HOTO("Hoto");

    private String label;

    CartType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}