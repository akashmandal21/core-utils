package com.stanzaliving.core.security.policeverification.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PVApplicable {

    ONLINE("Online", "Online"),
    OFFLINE("Offline", "Offline"),
    FRRO("FRRO", "Form-C For Foreign National"),
    EXCEL("Excel", "Excel file");

    private final String name;
    
    private final String label;
}
