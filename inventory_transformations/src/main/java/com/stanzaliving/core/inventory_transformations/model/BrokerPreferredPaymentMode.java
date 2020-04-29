package com.stanzaliving.core.inventory_transformations.model;
public enum BrokerPreferredPaymentMode {

    PAYTM("Paytm"),BANKTRANSFER("Bank Transfer"),VPA("UPI");

    private String displayName;

    private BrokerPreferredPaymentMode(String displayName) {
        this.displayName=displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getValue() {
        return ordinal() + 1;
    }

}
