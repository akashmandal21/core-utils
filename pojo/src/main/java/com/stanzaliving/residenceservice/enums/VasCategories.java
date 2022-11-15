package com.stanzaliving.residenceservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum VasCategories {

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
    TESTING("Testing");

    private final String value;

}
