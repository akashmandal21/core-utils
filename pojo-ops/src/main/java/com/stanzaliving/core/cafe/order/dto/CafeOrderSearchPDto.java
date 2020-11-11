package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.OrderSearchStatus;
import com.stanzaliving.core.cafe.order.constants.OrderType;
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
public class CafeOrderSearchPDto {
    private String orderId;
    private OrderSearchStatus searchStatus;
    private OrderType orderType;
    private LocalDate orderDate;
    private String residenceId;
    private String slotId;
    private LocalTime deliveryTime;
}
