package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum PaymentPlanResponseType {

    BOOKING("Booking Amount"),
    INSTALLMENT("Installment");

    private String name;

    /*PaymentPlanResponseType(String name) {
        this.name = name;
    }*/

    public String getName() {
        return name;
    }
}
