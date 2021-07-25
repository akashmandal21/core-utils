package com.stanzaliving.core.deal.client.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookingSubStatus {

    IN_PROGRESS("In Progress");

    private String bookingStatus;
}
