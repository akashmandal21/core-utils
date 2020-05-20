package com.stanzaliving.collector.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum InvoiceType {
    RENTAL(0), SERVICES(1), BOOKING(2), VAS(3), PENALTY(4), ANNUAL_MAINTENANCE(5), SECURITY_DEPOSIT(6);

    private int id;

    private static final Map<Integer, InvoiceType> map = new HashMap<>();

    static {
        for (InvoiceType invoiceType : values()) map.put(invoiceType.getId(), invoiceType);
    }

    public static InvoiceType getInvoiceTypeById(int id) {
        return map.get(id);
    }
}