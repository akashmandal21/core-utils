package com.stanzaliving.ledger.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum TransactionType {

    CREDIT("credit"),
    DEBIT("debit");
    private static final Map<String, TransactionType> map = new HashMap<>();

    static {
        for (TransactionType status : TransactionType.values()) {
            map.put(status.value, status);
        }
    }

    private final String value;

    public static TransactionType enumOf(String transactionType) {
        return map.get(transactionType);
    }
}
