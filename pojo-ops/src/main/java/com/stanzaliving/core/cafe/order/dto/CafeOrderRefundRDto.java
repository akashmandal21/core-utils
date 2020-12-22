package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.RefundMode;
import com.stanzaliving.core.cafe.order.constants.RefundReason;
import com.stanzaliving.core.cafe.order.constants.RefundStatus;
import com.stanzaliving.core.cafe.order.constants.RefundType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderRefundRDto {
    private Date refundTime;
    private double amount;
    private RefundStatus refundStatus;
    private RefundReason reasonReason;
    private RefundType refundType;
    private RefundMode refundMode;
    private boolean isPaymentRefund;
}
