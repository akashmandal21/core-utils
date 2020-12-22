package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BatchSlotSummaryRDto {
    private String slotId;
    private String slotName;
    private LocalTime deliveryTime;
    private Date deliveryDate;
    private String dispatchSummaryId;
    private boolean dispatched;
    private LocalTime dispatchedTime;
    private boolean received;
    private Date receivingTime;
}
