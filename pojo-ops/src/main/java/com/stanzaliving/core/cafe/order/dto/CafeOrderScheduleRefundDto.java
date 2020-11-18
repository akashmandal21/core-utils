package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.RefundMode;
import com.stanzaliving.core.cafe.order.constants.RefundReason;
import com.stanzaliving.core.cafe.order.constants.RefundType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderScheduleRefundDto {
    private String orderId;
    private String paymentId;
    private Double amount;
    private RefundReason refundReason;
    private RefundMode refundMode;
    private RefundType refundType;
}
