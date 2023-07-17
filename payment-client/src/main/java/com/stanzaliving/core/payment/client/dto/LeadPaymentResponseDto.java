package com.stanzaliving.core.payment.client.dto;

import com.stanzaliving.core.payment.enums.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LeadPaymentResponseDto {

    private String leadId;
    private long paymentTransactionId;
    private Date transactionDate;
    private Date completionDate;
    private String gatewayTransactionId;
    private double amount;
    private String uuid;
    private PaymentMode paymentMode;
    private Date updatedAt;
    private Date createdAt;
}
