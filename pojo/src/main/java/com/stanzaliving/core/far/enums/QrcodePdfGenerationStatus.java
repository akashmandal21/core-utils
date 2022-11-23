package com.stanzaliving.core.far.enums;

public enum QrcodePdfGenerationStatus {
    IN_PROCESS("In Process"), SUCCESS("Success"), FAILED("Failed");

    private String label;

    QrcodePdfGenerationStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}