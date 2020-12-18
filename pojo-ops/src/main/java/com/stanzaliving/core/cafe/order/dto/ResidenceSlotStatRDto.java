package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceSlotStatRDto {
    private String slotId;
    private LocalDate orderDate;
    private String dispatchSummaryId;
    private boolean dispatched;
}
