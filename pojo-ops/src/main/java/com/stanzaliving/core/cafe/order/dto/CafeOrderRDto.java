package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.DispatchMode;
import com.stanzaliving.core.cafe.order.constants.OrderStatus;
import com.stanzaliving.core.cafe.order.constants.RefundType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderRDto {
    private String orderId;
    private String orderCode;
    private Date orderTime;
    private Date deliveryTime;
    private CafeOrderUserRDto user;
    private OrderStatus status;
    private boolean paymentDone;
    private RefundType refundType;
    private CafeOrderPaymentDto payment;
    private List<CafeOrderItemRDto> items;
    private Double amount;
    private List<CafeOrderEventRDto> events;
    private DispatchMode dispatchMode;

}
