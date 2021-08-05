package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PaymentPlanResponseType {

    BOOKING("Booking Amount"),
    INSTALMENT("Instalment"),
    VAS("Vas");

    private String name;
}
