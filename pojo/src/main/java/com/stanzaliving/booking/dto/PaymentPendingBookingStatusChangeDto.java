package com.stanzaliving.bookingservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPendingBookingStatusChangeDto {

    private int totalPaymentPendingBooking;
    private int successfulStatusChange;
    private int failureStatusChange;
}
