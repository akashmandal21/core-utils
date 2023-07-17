package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookingResidenceType {


    SOCIETY("Society"),
    RESIDENCE("Residence"),
    MANAGED_APARTMENT("Managed Apartment");

    private String residenceType;

}
