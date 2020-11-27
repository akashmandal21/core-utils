package com.stanzaliving.core.cafe.order.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.core.cafe.order.constants.OrderSearchFilter;
import com.stanzaliving.core.cafe.order.constants.OrderSearchStatus;
import com.stanzaliving.core.cafe.order.constants.OrderType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

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
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate orderDate;
    private String residenceId;
    private LocalTime slotTime;
    private List<String> slotIds;
    private OrderSearchFilter filter;
    private String searchText;
    private String dispatchUserId;
    private String orderCode;
}
