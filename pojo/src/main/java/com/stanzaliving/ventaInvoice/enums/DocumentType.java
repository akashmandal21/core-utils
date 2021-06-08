package com.stanzaliving.ventaInvoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DocumentType {
    INVOICE("INVOICE"),
    CREDIT_NOTE("CREDIT_NOTE");
    private final String values;
}
