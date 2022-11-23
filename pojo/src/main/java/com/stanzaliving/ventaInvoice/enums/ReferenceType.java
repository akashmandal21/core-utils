package com.stanzaliving.ventaInvoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ReferenceType {
    DEAL("Deal"),
    RESIDENT("Resident");

    private final String values;
}
