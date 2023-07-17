package com.stanzaliving.core.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum AccessModule {

    APARTMENTS_LEAD_EDIT ("Apartments Lead Edit"),
    PG_LEAD_EDIT ("PG Lead Edit"),
    BOOKING_VIEW ("Booking View"),
    BOOKING_EDIT ("Booking Edit");

    private String name;
}
