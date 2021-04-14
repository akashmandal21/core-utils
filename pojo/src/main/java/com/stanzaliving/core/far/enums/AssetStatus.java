package com.stanzaliving.core.far.enums;

public enum AssetStatus {
    MAPPED_TO_QR("Mapped To QR"),
    READYFOR_TRANSFER_OUT("Ready For Transfer Out"), TRANSFERRED_OUT("Transferred Out"), READYFOR_TRANSFER_IN("Ready For Transfer In"), TRANSFERRED_IN("Transferred In"),
    HOTO_INPROGRESS("HOTO In Progress"), HOTO_REJECTED("HOTO Rejected"), HOTO_DONE("HOTO Done"),
    DISCARDED("Discarded"),
    VENDOR_CONFIRMATION_DUE("Vendor Confirmation Due"), VENDOR_REJECTED_RETURN("Vendor Rejected Return"), RETURNED("Returned");

    private String label;

    AssetStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}