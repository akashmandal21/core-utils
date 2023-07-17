package com.stanzaliving.ledger.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AllArgsConstructor
@Getter
public enum SettleLedgerActionStatus {

    REFUNDED("Refunded"),
    PARTIAL_REFUNDED("Partial Refunded"),
    REJECTED("Rejected"),
    CARRY_FORWARD("CarryForward"),
    PENDING("Pending"),
    SETTLED_WITH_EXHAUSTION("Settled With Exhaustion"),
    RAISED_TO_NODAL("Raised To Nodal"),
    PENDING_ON_FINANCE_APPROVAL("Pending On Finance Approval"),
    PENDING_ON_RAZORPAYX("Pending On RazorpayX"),
    STATUS_CHECK("Status Check");

    private String name;
    public static Set<Object> ENUM_MAP = new HashSet<>();
    static {
        for (SettleLedgerActionStatus actionType: SettleLedgerActionStatus.values()) {
            Map<Object,Object > map = new HashMap<>();
            map.put("label" , actionType.name);
            map.put("value",actionType);
            ENUM_MAP.add(map);
        }
    }
}