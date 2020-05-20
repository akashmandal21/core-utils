package com.stanzaliving.collector.enums;

import java.util.HashMap;
import java.util.Map;

public enum BookingType {

    NEW {
        public int getBookingTypeId() {
            return 0;
        }
    }, RETENTION {
        public int getBookingTypeId() {
            return 1;
        }
    }, ROYALTY {
        public int getBookingTypeId() {
            return 2;
        }
    }, B2B {
        public int getBookingTypeId() {
            return 3;
        }
    }, SUITES_BOOKING {
        public int getBookingTypeId() {
            return 4;
        }
    };
    private static final Map<Integer, BookingType> map = new HashMap<>();

    static {
        for (BookingType bookingType : values()) map.put(bookingType.getBookingTypeId(), bookingType);
    }

    public static BookingType getBookingTypeFromId(int id) {
        return map.get(id);
    }

    public abstract int getBookingTypeId();
}