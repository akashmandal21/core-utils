package com.stanzaliving.ledger.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum SettleLedgerActionStatus {

    REFUNDED,
    CARRY_FORWARD,
    PENDING,
    SETTLED_WITH_EXHAUSTION,
    RAISED_TO_NODAL,
    PENDING_ON_FINANACE_APPROVAL;
}

