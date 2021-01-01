package com.stanzaliving.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class PaymentRefundEntityDto {
    private String merchantTransactionId;
    private String payId;
    private String paymentStatus;
    private String refundId;
    private String userId;

    public PaymentRefundEntityDto(String merchantTransactionId, String paymentStatus, String userId, String payId) {
        this.merchantTransactionId = merchantTransactionId;
        this.payId = payId;
        this.paymentStatus = paymentStatus;
        this.userId = userId;
    }
}
