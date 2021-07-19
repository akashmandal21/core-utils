package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookingType {

    PROFESSIONAL("Working Professional", 4),
    SCHOLAR("Student", 5),
    ALL("All" , 0),
    B2B("B2B" , 1),
    B2C_NEW_CLOSURES("B2C-new closures" , 2),
    B2C_RETENTION("B2C-Retention" , 3);

    private String type;
    int value;
}
