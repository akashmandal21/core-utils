package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeConfirmedOrderRDto {
    private String orderId;
    private String orderCode;
    private String deliveryCode;
    private Date deliveryTime;
    private Date orderTime;
    private CafePaymentStatusDto payment;
}
