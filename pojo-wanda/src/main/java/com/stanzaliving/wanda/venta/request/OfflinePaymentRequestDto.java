package com.stanzaliving.wanda.venta.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfflinePaymentRequestDto {
    private String bookingUuid;
    private double amount;
    private String paymentMode;
}
