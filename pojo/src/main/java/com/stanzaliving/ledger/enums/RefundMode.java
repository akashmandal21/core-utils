package com.stanzaliving.ledger.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RefundMode {
    BANK_ACCOUNT("IMPS"),
    UPI_ACCOUNT("UPI"),
    CARRY_FORWARD("CARRY_FORWARD");
    private final String values;

}
