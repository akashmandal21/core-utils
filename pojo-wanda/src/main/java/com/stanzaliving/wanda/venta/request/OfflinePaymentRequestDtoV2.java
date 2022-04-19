package com.stanzaliving.wanda.venta.request;

import com.stanzaliving.core.payment.enums.PaymentMode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfflinePaymentRequestDtoV2 {
    
	private String bookingId;

    private String userUuid;

    private PaymentMode paymentMode;

    private double amount;

    private String bookingUuid;
}
