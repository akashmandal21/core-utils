package com.stanzaliving.ventaInvoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Split {
    EQUAL("Equal"),
    UNEQUAL("Unequal");
    private final String split;
}


