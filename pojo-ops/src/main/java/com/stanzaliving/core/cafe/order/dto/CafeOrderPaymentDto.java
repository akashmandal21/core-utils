package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.PaymentStatus;
import com.stanzaliving.core.payment.enums.PaymentMode;
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
    private PaymentMode mode;
    private Double amount;
    private Date transactionStartTime;
    private Date transactionEndTime;
    private String transactionId;
    private String bankReferenceNo;
    private String merchantReferenceNo;
    private PaymentStatus status;

}
