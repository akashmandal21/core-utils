package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.OrderType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OrderStatsRDto {
    private OrderType orderType;
    private Integer count;
    private List<ResidenceStatRDto> residenceStats;
}
