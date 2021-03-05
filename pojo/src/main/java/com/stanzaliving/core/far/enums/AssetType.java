package com.stanzaliving.core.far.enums;

public enum
AssetType {
    SINGLE("Single"), MULTIPLE("Multiple"), RENTAL("Rental"), LANDLORD("Landlord"), THIRDPARTY("Third Party");

    private String label;

    AssetType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}