package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ResidenceAgreementType {
    LEASE_DEED("Lease Deed"),
    ONM("ONM"),
    STAY_CURATION("Stay Curation");

    private String propertyType;
}
