package com.stanzaliving.core.client.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookingSubStatus {

    IN_PROGRESS("In Progress"),
    GUEST_PENDING_KYC_SUBMISSION("GUEST PENDING KYC SUBMISSION"),
    PENDING_SELFIE_SUBMISSION("PENDING SELFIE SUBMISSION"),
    PRIMARY_SIGNING_PENDING("PRIMARY SIGNING PENDING"),
    PERSONAL_DETAILS_PENDING("PERSONAL DETAILS PENDING"),
    SECONDARY_SIGNING_PENDING("SECONDARY SIGNING PENDING");

    private String bookingStatus;
}
