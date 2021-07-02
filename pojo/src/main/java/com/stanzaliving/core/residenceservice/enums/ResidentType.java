package com.stanzaliving.core.residenceservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResidentType {
    PROFESSIONAL("Professional"),
    SCHOLAR("Scholar");

    private String name;

    public String enumValue() {
        return name;
    }

}
