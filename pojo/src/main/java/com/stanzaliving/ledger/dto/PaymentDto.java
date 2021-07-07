package com.stanzaliving.ledger.dto;

import com.stanzaliving.collector.enums.TransactionType;
import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.core.payment.enums.PaymentStatus;
import com.stanzaliving.core.payment.enums.StanzaPaymentService;
import com.stanzaliving.core.user.enums.UserType;
import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PaymentDto {

    private String merchantTransactionId;
    private String currentPaymentId;
    private double amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private TransactionType transactionType;
    private String userId;
    private UserType userType;
    private String paymentMetadata;
    private String bookingUuid;
    private StanzaPaymentService paymentService;
    private String serviceTransactionId;
    private boolean current;
    private String refundTransactionId;
}
