package com.stanzaliving.ventaInvoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum InvoiceType {
    INVOICE("Invoice"),
    CREDIT_NOTE("Credit Note");
    private final String values;
}
