package com.stanzaliving.wanda.enums;

import java.util.HashMap;
import java.util.Map;

public enum InvoiceType {
    RENTAL {
        public int getInvoiceTypeId() {
            return 0;
        }
        public String getInvoiceTypePrefix() {
            return "R";
        }
    },
    SERVICES {
        public int getInvoiceTypeId() {
            return 1;
        }
        public String getInvoiceTypePrefix() {
            return "S";
        }
    },
    BOOKING {
        public int getInvoiceTypeId() {
            return 2;
        }
        public String getInvoiceTypePrefix() {
            return null;
        }
    },
    VAS {
        public int getInvoiceTypeId() {
            return 3;
        }
        public String getInvoiceTypePrefix() {
            return "S";
        }
    },
    PENALTY {
        public int getInvoiceTypeId() {
            return 4;
        }
        public String getInvoiceTypePrefix() {
            return "S";
        }
    },
    ANNUAL_MAINTENANCE {
        public int getInvoiceTypeId() {
            return 5;
        }
        public String getInvoiceTypePrefix() {
            return "S";
        }
    },
    SECURITY_DEPOSIT {
        public int getInvoiceTypeId() {
            return 6;
        }
        public String getInvoiceTypePrefix() {
            return null;
        }
    },
    FOOD_SERVICE {
        public int getInvoiceTypeId() {
            return 7;
        }
        public String getInvoiceTypePrefix() {
            return "S";
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
    public abstract String getInvoiceTypePrefix();

}
