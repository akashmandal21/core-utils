package com.stanzaliving.core.cafe.order.dto;

import com.stanzaliving.core.cafe.order.constants.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

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
    private String slotIds;
    private OrderSearchFilter filter;
    private String searchText;
    private String dispatchUserId;
    private DispatchMode dispatchMode;
    private String orderCode;
    private String deliveryCode;
    private ServingMode mode;
    private OrderStatus status;
    private Boolean inRoomDelivery;
}
