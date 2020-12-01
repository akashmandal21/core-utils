package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.*;
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
    private Date expectedDeliveryTime;
    private CafeOrderUserRDto user;
    private OrderStatus status;
    private boolean paymentDone;
    private RefundType refundType;
    private RefundStatus refundStatus;
    private CafeOrderPaymentDto payment;
    private List<OrderedItemRDto> items;
    private Double amount;
    private Double gst;
    private Double totalAmount;
    private List<CafeOrderEventRDto> events;
    private ServingMode servingMode;
    private OrderDeliveryPreferenceRDto deliveryPreference;
    private DispatchMode dispatchMode;
    private String dispatchUserId;
    private String dispatchCode;
    private String cafeId;
    private String residenceId;
    private String slotId;

}
