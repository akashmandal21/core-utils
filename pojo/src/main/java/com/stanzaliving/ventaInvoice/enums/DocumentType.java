package com.stanzaliving.ventaInvoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DocumentType {
    INVOICE("Invoice"),
    CREDIT_NOTE("credit_note");
    private final String values;
}
