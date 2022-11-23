package com.stanzaliving.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum InvoiceStatus {

    INVOICE_SUBMITTED("Invoice Submitted"),
    SENT_BACK_BY_FINANCE("Sent Back By Finance"),
    INVOICE_PARTIALLY_PAID("Invoice Partially Paid"),
    INVOICE_FULLY_PAID("Invoice Fully Paid");

    private String status;

}


