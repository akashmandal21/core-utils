package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OrderStatus {
    INITIATED("Initiated", "order.created"),
    CANCELLED("Cancelled", "order.cancelled"),
    PLACED("Placed", "order.placed"),
    CONFIRMED("Confirmed", "order.confirmed"),
    PREPARING("Preparing", "order.preparing"),
    PREPARED("Prepared", "order.prepared"),
    PACKED("Packed", "order.packed"),
    DISPATCHED("Dispatched", "order.dispatched"),
    DELIVERED("Delivered", "order.delivered");

    private final String status;
    private final String event;
}
