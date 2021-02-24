package com.stanzaliving.core.far.enums;

public enum AssetLocatedIn {
    ROOM("Room"), OTHER_AREA("Other Area");

    private String label;

    AssetLocatedIn(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}