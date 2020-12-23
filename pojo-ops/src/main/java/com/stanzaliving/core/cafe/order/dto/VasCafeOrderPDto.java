package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.enums.SlotType;
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
public class VasCafeOrderPDto {
    private String vasOrderId;

    private String cafeId;
    private String residenceId;
    private ServingMode servingMode;
    private PaymentType paymentType;
    private List<VasCafeOrderItemPDto> items;
    private OrderUserPDto userDetails;
    private SlotType slotType;
    private String slotId;
    private double amount;
    private double gstAmount;
    private Date orderDate;
    private Date deliveryTime;
    private Date expectedDeliveryTime;
    private OrderStatus orderStatus;
    private RefundType refundType;
    private RefundMode refundMode;
    private RefundStatus refundStatus;
    private boolean paymentDone;
    private String orderCode;

}
