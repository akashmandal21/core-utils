package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.OrderSearchFilter;
import com.stanzaliving.core.cafe.order.constants.OrderSearchStatus;
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
public class CafeOrderSearchPDto {
    private String cafeId;
    private String orderId;
    private OrderSearchStatus searchStatus;
    private OrderType orderType;
    private String residenceId;
    private List<String> slotIds;
    private OrderSearchFilter filter;
    private String searchText;
    private String dispatchUserId;
    private String orderCode;
    private String deliveryCode;
}
