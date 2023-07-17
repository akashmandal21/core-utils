package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ServiceType {
    CAFE("Cafe"),RC("Residence_captain"),OTHERS("Others");

    private final String serviceType;
}
