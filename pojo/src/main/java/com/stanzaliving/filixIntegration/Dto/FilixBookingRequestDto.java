package com.stanzaliving.filixIntegration.Dto;

import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.core.payment.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilixBookingRequestDto {
    private String bookingId;

    private String userUuid;

    private PaymentMode paymentMode;

    private double amount;

    private PaymentStatus paymentStatus;

    private String merchantTransactionId;
}
