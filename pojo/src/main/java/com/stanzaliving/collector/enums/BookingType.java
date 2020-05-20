package com.stanzaliving.collector.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum BookingType {

    NEW (0), RETENTION (1), ROYALTY (2), B2B (3), SUITES_BOOKING (4);

    private int bookingTypeId;

}
