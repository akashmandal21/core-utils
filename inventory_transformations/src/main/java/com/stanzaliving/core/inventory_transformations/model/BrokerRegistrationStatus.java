package com.stanzaliving.core.inventory_transformations.model;
public enum BrokerRegistrationStatus {
    DOCUMENTS{
        public int getPreferredPaymentModeTypeId() {
            return 0;
        }
    },COMMISSIONS{
        public int getPreferredPaymentModeTypeId() {
            return 1;
        }
    },VERIFIED{
        public int getPreferredPaymentModeTypeId() {
            return 2;
        }
    };
    public abstract int getPreferredPaymentModeTypeId();
}
