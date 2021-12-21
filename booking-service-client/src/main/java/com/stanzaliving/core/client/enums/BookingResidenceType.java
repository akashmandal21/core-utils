package com.stanzaliving.core.client.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookingResidenceType {


    SOCIETY("Society"),
    RESIDENCE("Residence");

    private String residenceType;
}