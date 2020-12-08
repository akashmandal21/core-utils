package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderAmountDto {
    private Double itemAmount;
    private Double charges;
    private Double couponAmount;
    private Double gst;
    private Double totalAmount;
}
