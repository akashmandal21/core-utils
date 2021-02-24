package com.stanzaliving.core.far.enums;

public enum AssetOwner {
    STANZA_LIVING("Stanza Living"), VENDOR("Vendor"), LANDLORD("Landlord"), THIRDPARTY("Third Party");

    private String label;

    AssetOwner(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}