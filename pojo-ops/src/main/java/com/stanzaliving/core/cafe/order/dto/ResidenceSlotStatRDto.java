package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceSlotStatRDto {
    private Integer count;
    private String slotId;
    private LocalDate orderDate;
    private String dispatchSummaryId;
    private boolean dispatched;
    private boolean received;
    private LocalTime startTime;
    private LocalTime endTime;
    private boolean windowClosed;
}
