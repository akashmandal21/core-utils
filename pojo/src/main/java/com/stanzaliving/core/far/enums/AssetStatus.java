package com.stanzaliving.core.far.enums;

public enum AssetStatus {
    MAPPED_TO_QR("Mapped To QR", "#60C3AD", "#EDFFF5"),
    READYFOR_TRANSFER_OUT("Ready For Transfer-Out", "#60C3AD", "#EDFFF5"),
    TRANSFERRED_OUT("Transferred Out", "#60C3AD", "#EDFFF5"),
    READYFOR_TRANSFER_IN("Ready For Transfer-In", "#60C3AD", "#EDFFF5"),
    TRANSFERRED_IN("Transferred In", "#60C3AD", "#EDFFF5"),
    HOTO_INPROGRESS("HOTO In Progress", "#60C3AD", "#EDFFF5"),
    HOTO_REJECTED("HOTO Rejected", "#60C3AD", "#EDFFF5"),
    HOTO_DONE("HOTO Done", "#60C3AD", "#EDFFF5"),
    DISCARDED("Discarded", "#60C3AD", "#EDFFF5"),
    VENDOR_CONFIRMATION_DUE("Vendor Confirmation Due", "#60C3AD", "#EDFFF5"),
    VENDOR_REJECTED_RETURN("Vendor Rejected Return", "#60C3AD", "#EDFFF5"),
    RETURNED("Returned", "#60C3AD", "#EDFFF5"),
    PACK_OPENED("Pack Opened", "#60C3AD", "#EDFFF5"),
    ASSET_FULLY_UNPACKED("Asset Fully Unpacked", "#60C3AD", "#EDFFF5");

    private String label;
    private String textColor;
    private String bgColor;

    AssetStatus(String label, String textColor, String bgColor) {
        this.label = label;
        this.textColor = textColor;
        this.bgColor = bgColor;
    }

    public String getLabel() {
        return label;
    }

    public String getTextColor() {return textColor; }

    public String getBgColor() {return bgColor; }
}