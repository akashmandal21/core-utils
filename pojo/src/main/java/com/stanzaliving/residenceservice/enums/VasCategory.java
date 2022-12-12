package com.stanzaliving.residenceservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VasCategory {

    FOOD("Food"),
    ROOM("Room"),
    LAUNDRY("Laundry"),
    ELECTRICITY("Electricity"),
    TRANSPORT("Transport"),
    MAINTENANCE("Maintenance"),
    PARKING("Parking"),
    HOUSEKEEPING("Housekeeping"),
    INTERNET("Internet"),
    SECURITY("Security"),
    FITNESS("Fitness"),
    TESTING("Testing"),
    OTHERS("Others");

    private final String value;

}
