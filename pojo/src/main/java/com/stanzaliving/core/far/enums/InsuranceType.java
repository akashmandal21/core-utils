package com.stanzaliving.core.far.enums;

public enum InsuranceType {
    COMPREHENSIVE("Comprehensive"), NON_COMPREHENSIVE("Non-Comprehensive");

    private String label;

    InsuranceType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}