package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.OrderSearchFilter;
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
    private LocalTime deliveryTime;
    private OrderSearchFilter filter;
    private String name;
    private String phone;
    private String dispatchUserId;
    private String orderCode;
}
