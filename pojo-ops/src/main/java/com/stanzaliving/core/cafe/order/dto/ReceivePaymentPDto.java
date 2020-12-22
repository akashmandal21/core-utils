package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.payment.enums.PaymentMode;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ReceivePaymentPDto {
    private String orderId;
    private PaymentMode mode;
    private Double amount;
}
