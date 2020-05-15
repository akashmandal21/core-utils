package com.stanzaliving.collector.enums;

import java.util.HashMap;
import java.util.Map;

public enum InvoiceType {
    RENTAL {
        public int getInvoiceTypeId() {
            return 0;
        }
    },
    SERVICES {
        public int getInvoiceTypeId() {
            return 1;
        }
    },
    BOOKING {
        public int getInvoiceTypeId() {
            return 2;
        }
    },
    VAS {
        public int getInvoiceTypeId() {
            return 3;
        }
    },
    PENALTY {
        public int getInvoiceTypeId() {
            return 4;
        }
    },
    ANNUAL_MAINTENANCE {
        public int getInvoiceTypeId() {
            return 5;
        }
    },
    SECURITY_DEPOSIT{
        public int getInvoiceTypeId() {
            return 6;
        }
    };

    private static final Map<Integer, InvoiceType> map = new HashMap<>();

    static {
        for (InvoiceType invoiceType : values()) map.put(invoiceType.getInvoiceTypeId(), invoiceType);
    }

    public static InvoiceType get(int id) {
        return map.get(id);
    }
    public abstract int getInvoiceTypeId();
}
