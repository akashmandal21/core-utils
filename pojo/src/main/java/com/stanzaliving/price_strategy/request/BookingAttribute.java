package com.stanzaliving.price_strategy.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum BookingAttribute {

    TENURE("Tenure"),
    CSD_MONTH("CSD month"),
    OCCUPANCY("Occupancy"),
    ROOM_OCCUPIED("Rooms occupied"),
    ROOM_CONVERSION_STATUS("Room conversion status"),
    BOOKING_MODE("Booking mode");

    private String bookingAttributeName;

}
