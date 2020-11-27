package com.stanzaliving.core.cafe.order.dto;

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
public class CafePaymentStatusDto {
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private String merchantReferenceNo;
    private String bankReferenceNo;
    private Double amount;
    private Date time;
}
