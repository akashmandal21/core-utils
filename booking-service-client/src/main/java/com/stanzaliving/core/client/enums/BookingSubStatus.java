package com.stanzaliving.core.client.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookingSubStatus {

    IN_PROGRESS("In Progress"),
//    PAYMENT_PENDING("PAYMENT_PENDING");

    private String bookingStatus;
}
