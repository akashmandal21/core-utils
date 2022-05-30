package com.stanzaliving.core.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentLinkResponseDto {
    
    private Integer amount;
    private String merchantTransactionId;
    private String paymentLink;
    private String paymentLinkId;
}
