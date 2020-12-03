package com.stanzaliving.core.cafe.order.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BatchOrderDispatchSummaryRDto {
    private String dispatchSummaryId;
    private String cafeId;
    private String residenceId;
    private String slotId;
    private int hotbagCount;
    private int orderCount;
    private int packetCount;
    private boolean received;
    private int receivedHotbagCount;
    private int receivedOrderCount;
    private int receivedPacketCount;
    private Date receivingTime;
    private Date notificationTime;
    private String slotName;
    private LocalTime deliveryTime;
}
