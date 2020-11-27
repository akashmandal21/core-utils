package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.OrderType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OrderStatsRDto {
    private OrderType orderType;
    private Integer count;
    private Map<LocalTime, List<String>> slots;
    private List<ResidenceStatRDto> residenceStats;
}
