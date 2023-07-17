package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookingServiceType {

    MANDATORY("MANDATORY"),
    VAS("VAS");

    private String type;
}
