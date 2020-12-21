package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.OrderType;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceWiseStatRDto {
    private String cafeId;
    private String cafeName;
    private String slotId;
    private String slotName;
    private Long count;
    private Long picked;
    private OrderType orderType;

}
