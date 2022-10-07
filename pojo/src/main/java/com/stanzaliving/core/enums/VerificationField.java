package com.stanzaliving.core.enums;

public enum VerificationField {
    ID_TYPE("idType"),
    ID_NUMBER("idNumber"),
	ID_NAME("idName"),
	ID_DOB("idDob"),
	ID_ADDRESS("idAddress");

    public final String key;

    VerificationField(String key) {
        this.key = key;
    }
}
