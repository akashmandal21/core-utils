package com.stanzaliving.core.boq_service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BoqItemProvider {
    SL("SL"),
    LL("LL");
    private String provider;
}
