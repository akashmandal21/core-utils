package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum MacValidationResponseStatus {
    SUCCESS("Success"),
    MAC_NOT_REGISTERED("Mac not registered"),
    RESIDENCE_MISMATCH("Residence mismatch");

    public final String label;

    MacValidationResponseStatus(String label) {
        this.label = label;
    }
}
