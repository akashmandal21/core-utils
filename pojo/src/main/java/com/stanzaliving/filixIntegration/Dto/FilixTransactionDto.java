package com.stanzaliving.filixIntegration.Dto;

import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.core.payment.enums.PaymentStatus;
import com.stanzaliving.core.payment.enums.StanzaPaymentService;
import lombok.*;


@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilixTransactionDto {
    private String merchantTransactionId;

    private double amount;

    private PaymentMode paymentMode;

    private PaymentStatus paymentStatus;

    private String userId;

    private String paymentMetadata;

    private StanzaPaymentService paymentService;

    private String serviceTransactionId;

    private String refundTransactionId;

    private PaymentStatus refundStatus;

    private Double refundedAmount;

    private String currentPaymentId;

}
