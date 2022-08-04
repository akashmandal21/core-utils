package com.stanzaliving.core.security.enums;

import lombok.Getter;

@Getter
public enum RequestType {
    LEAVE("Leave"),
    LATE_ENTRY("Late-entry"),
    BLANKET_APPROVAL("Blanket approval");

    private final String label;

    private RequestType(String label){
        this.label = label;
    }

}
