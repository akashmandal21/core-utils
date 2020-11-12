package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OrderSearchFilter {
    PENDING_DISPATCH("Pending Dispatch"),

    IN_ROOM_DELIVERY("In Room Delivery"),

    EXPRESS_DELIVERY("Express Delivery"),

    DISPATCHED("In Transit"),

    DELAYED("Delayed");

    private final String filter;


}
