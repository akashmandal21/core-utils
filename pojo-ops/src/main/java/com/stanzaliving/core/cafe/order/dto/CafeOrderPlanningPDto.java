package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.OrderSearchStatus;
import com.stanzaliving.core.cafe.order.constants.OrderType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class CafeOrderPlanningPDto {
    @NotNull(message = "Empty Cafe Id")
    private String cafeId;
    private String residenceId;
    @NotNull(message = "Empty Slot Id")
    private String slotIds;
    @NotNull(message = "Empty Search Status")
    private OrderSearchStatus searchStatus;
    private LocalDate orderDate;
    private OrderType orderType;
}
