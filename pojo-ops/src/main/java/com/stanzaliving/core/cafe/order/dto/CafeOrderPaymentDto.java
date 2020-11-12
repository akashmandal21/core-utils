package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.PaymentType;
import com.stanzaliving.core.cafe.order.constants.RefundStatus;
import com.stanzaliving.core.cafe.order.constants.RefundType;
import com.stanzaliving.core.payment.enums.PaymentMode;
import com.stanzaliving.core.payment.enums.PaymentStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderPaymentDto {
    private PaymentType paymentType;
    private PaymentMode mode;
    private Double amount;
    private Date transactionTime;
    private String transactionId;
    private String bankReferenceNo;
    private String merchantReferenceNo;
    private PaymentStatus status;
    private RefundType refundType;
    private RefundStatus refundStatus;

}
