package com.stanzaliving.collector.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum BookingType {

    NEW (0), RETENTION (1), ROYALTY (2), B2B (3), SUITES_BOOKING (4);

    private int id;


    private static final Map<Integer, BookingType> map = new HashMap<>();

    static {
        for (BookingType bookingType : values()) map.put(bookingType.getId(), bookingType);
    }

    public static BookingType getBookingTypeById(int id) {
        return map.get(id);
    }

}
