package com.stanzaliving.invoice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum InvoiceStatus {

    L1_APPROVAL_DUE("L1 Approval Due", "#FFB701"),
    L2_APPROVAL_DUE("L2 Approval Due", "#FFB701"),
    L3_APPROVAL_DUE("L3 Approval Due", "#FFB701"),
    L1_REJECTED("L1 Rejected", "#F55F71"),
    L2_REJECTED("L2 Rejected", "#F55F71"),
    L3_REJECTED("L3 Rejected", "#F55F71"),
    PAYMENT_PENDING("Payment Pending", null),
    PARTIALLY_PAID("Partially Paid", null),
    FULLY_PAID("Fully Paid", null);

    private String statusText;

    private String statusColor;

}


