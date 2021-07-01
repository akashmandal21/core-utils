package com.stanzaliving.core.far.enums;

public enum AmcType {
    COMPREHENSIVE("Comprehensive"), NON_COMPREHENSIVE("Non-Comprehensive");

    private String label;

    AmcType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}