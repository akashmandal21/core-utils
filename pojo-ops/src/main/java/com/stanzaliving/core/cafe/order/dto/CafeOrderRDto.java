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
    private double amount;
    private double gst;
    private double totalAmount;
    private List<CafeOrderEventRDto> events;
    private ServingMode servingMode;
    private OrderDeliveryPreferenceRDto deliveryPreference;
    private DispatchMode dispatchMode;
    private String dispatchUserId;
    private String dispatchCode;
    private String cafeId;
    private String cafeName;
    private String residenceId;
    private String slotId;
    private List<CafeOrderRefundRDto> refundData;
    private double refundedAmount;
    private double tobeRefundAmount;
    private double totalPaymentAmount;

}
