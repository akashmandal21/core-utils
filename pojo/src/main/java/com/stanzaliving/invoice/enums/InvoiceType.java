package com.stanzaliving.invoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum InvoiceType {

    REGULAR("Regular", "RG"),
    ADVANCE("Advance", "AD");

    private String status;

    public String shortCode;

}
