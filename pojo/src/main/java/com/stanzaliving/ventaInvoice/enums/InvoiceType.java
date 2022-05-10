package com.stanzaliving.ventaInvoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum InvoiceType {
    INVOICE("Invoice"),
    CREDIT_NOTE("Credit Note"),
    CANCELLATION_CHARGE("Cancellation Charge");
    private final String values;
}
