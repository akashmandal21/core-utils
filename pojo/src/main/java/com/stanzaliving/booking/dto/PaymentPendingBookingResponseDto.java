package com.stanzaliving.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentPendingBookingResponseDto {
    private String uuid;
    private String bookingUuid;
    private Date paymentPendingExpiryTime;
    private String merchantTransactionId;
    private double pendingAmount;
}
