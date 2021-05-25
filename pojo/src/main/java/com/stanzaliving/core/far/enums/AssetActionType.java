package com.stanzaliving.core.far.enums;

public enum AssetActionType {
    ASSET_MAPPED_TO_QRCODE("Asset Mapped to QR code"),
    BASIC_DETAILS_CHANGED("Asset Basic Details Changed"),
    ADDITIONAL_DETAILS_CHANGED("Additional Details Changed"),
    ALLOCATION_DETAILS_CHANGED("Allocation Details Changed"),
    PURCHASE_DETAILS_CHANGED("Purchase Details Changed"),
    PO_NUMBER_CHANGED("PO Number Changed"),
    QR_CODE_REPLACED("QR Code Replaced"),
    ASSET_VERIFIED("Asset Verified"),
    ASSET_AUDITED("Asset Audited"),
    LOCATION_CHANGED("Asset Location Changed"),
    TRANSFERRED_OUT("Asset Transferred Out"),
    TRANSFERRED_IN("Asset Transferred In"),
    ASSET_DISCARDED("Asset Discarded"),
    HOTO_DONE("Asset HOTO Done"),
    AMC_ADDED("AMC Details Added"),
    AMC_UPDATED("Current AMC Details Changed"),
    AMC_REMOVED("Asset AMC Removed"),
    AMC_EXPIRED("Asset AMC Expired"),
    INSURANCE_ADDED("Insurance Details Added"),
    INSURANCE_UPDATED("Current Insurance Details Changed"),
    INSURANCE_REMOVED("Asset Insurance Removed"),
    INSURANCE_EXPIRED("Asset Insurance Expired");

    private String label;

    AssetActionType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}