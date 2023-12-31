package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.OrderStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ResidenceStatRDto {
    private String residenceId;
    private Integer count;
    private String name;
    private Map<LocalDate, Map<LocalTime, List<ResidenceSlotStatRDto>>> slots;
    private LocalTime nextSlot;
    private boolean pending;
    private Map<OrderStatus, Integer> statusWiseCount;

}
