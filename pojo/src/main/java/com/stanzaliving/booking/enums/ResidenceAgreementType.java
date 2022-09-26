package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ResidenceAgreementType {
    LEASE_DEED("Lease Deed"),
    ONM("ONM");

    private String propertyType;
}
