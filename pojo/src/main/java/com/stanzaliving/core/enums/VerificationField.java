package com.stanzaliving.core.enums;

public enum VerificationField {
    ID_TYPE("idType"),
    ID_NUMBER("idNumber");

    public final String key;

    VerificationField(String key) {
        this.key = key;
    }
}
