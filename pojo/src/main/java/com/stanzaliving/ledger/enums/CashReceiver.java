package com.stanzaliving.ledger.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CashReceiver {

    RESIDENT_CAPTAIN("RC"),
    CLUSTER_MANAGER("CM"),
    NODAL_OFFICER("Nodal"),
    BANK("Bank"),
    RESIDENT("Resident");
    private final String values;
}
