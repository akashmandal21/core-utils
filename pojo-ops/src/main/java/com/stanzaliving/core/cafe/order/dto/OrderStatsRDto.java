package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.OrderType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OrderStatsRDto {
    private OrderType orderType;
    private Integer count;
    private Map<LocalDate,Map<LocalTime, Set<String>>> slots;
    private List<ResidenceStatRDto> residenceStats;
    private boolean pending;
}
