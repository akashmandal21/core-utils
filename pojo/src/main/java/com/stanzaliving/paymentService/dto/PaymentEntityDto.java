package com.stanzaliving.paymentService.dto;

import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.core.payment.enums.PaymentSource;
import com.stanzaliving.core.payment.enums.PaymentStatus;
import com.stanzaliving.core.payment.enums.StanzaPaymentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentEntityDto {

    private String merchantTransactionId;

    private String currentPaymentId;

    private double amount;

    private PaymentMode paymentMode;

    private PaymentStatus paymentStatus;

    private String transactionType;

    private String userId;

    private String userType;

    private String paymentMetadata;

    private PaymentSource paymentSource;

    private String bookingUuid;

    private StanzaPaymentService paymentService;

    private String serviceTransactionId;

    private boolean current = true;

    private String refundTransactionId;

    private Boolean isEndUserPayingFee = false;

    private String chequeNumber;

    private Boolean isMigrated = false;

    private String rblTransactionId;

    private Long id;

    private String uuid;

    private String createdBy;

    private String updatedBy;

    private Date createdAt;

    private Date updatedAt;
}
