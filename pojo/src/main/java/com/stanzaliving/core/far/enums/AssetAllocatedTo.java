package com.stanzaliving.core.far.enums;

public enum AssetAllocatedTo {
    BUILDING("Building"), EMPLOYEE("Employee");

    private String label;

    AssetAllocatedTo(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}