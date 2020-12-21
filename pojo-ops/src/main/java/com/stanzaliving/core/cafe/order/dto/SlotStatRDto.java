package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class SlotStatRDto {
    private Long totalCount;
    private Long pendingCount;
    private Long deliveredCount;
    private Long roomDeliveryCount;
    private Long pickUpCount;
}
