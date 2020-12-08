package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.enums.SlotType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeMenuSlotRDto {
    private String slotId;
    private SlotType slotType;
    private LocalTime deliveryTime;
    private String slotName;
    private LocalTime startTime;
    private LocalTime endTime;
}
