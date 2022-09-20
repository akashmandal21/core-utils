package com.stanzaliving.ledger.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RefundMode {
    BANK_ACCOUNT("IMPS"),
    UPI_ACCOUNT("UPI");
    private final String values;

}
