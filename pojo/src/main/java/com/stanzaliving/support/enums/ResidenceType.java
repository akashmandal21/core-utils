package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResidenceType {
    ALL_RESIDENCE("ALL_RESIDENCE"),
    ALL_MANAGED_APPARTMENTS("ALL_MANAGED_APPARTMENTS"),
    RESIDENCE("RESIDENCE");
    private String name;
}
