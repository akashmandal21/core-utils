package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderCreatedRDto {
    private String orderId;
    private Double totalAmount;
    private Double gstAmount;
    private Double amount;
    private String orderCode;
}
