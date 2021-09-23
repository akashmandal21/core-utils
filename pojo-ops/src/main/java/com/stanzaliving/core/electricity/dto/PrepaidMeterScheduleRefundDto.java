package com.stanzaliving.core.electricity.dto;

import com.stanzaliving.core.cafe.order.constants.RefundMode;
import com.stanzaliving.core.cafe.order.constants.RefundReason;
import com.stanzaliving.core.cafe.order.constants.RefundType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PrepaidMeterScheduleRefundDto {
    private String meterId;
    private String paymentId;
    private double amount;
    private RefundReason refundReason;
    private RefundMode refundMode;
    private RefundType refundType;
}
