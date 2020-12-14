package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

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
    private List<OrderedItemRDto> items;
}
