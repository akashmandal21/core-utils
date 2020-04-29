package com.stanzaliving.core.inventory_transformations.model;

public enum KycDocumentType {
    ADHAAR {
        public String getKycDocumentTypeString() {
            return "ADHAAR";
        }
    }, DRIVING_LICENCE {
        public String getKycDocumentTypeString() {
            return "DRIVING LICENCE";
        }
    }, PAN_CARD {
        public String getKycDocumentTypeString() {
            return "PAN CARD";
        }
    };

    public abstract String getKycDocumentTypeString();
}
