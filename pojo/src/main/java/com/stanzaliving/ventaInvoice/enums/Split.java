package com.stanzaliving.ventaInvoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Split {
    DEAL("Equal"),
    RESIDENT("Unequal");
    private final String split;
}


