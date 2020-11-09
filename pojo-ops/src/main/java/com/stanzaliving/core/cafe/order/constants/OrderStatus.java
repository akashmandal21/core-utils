package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.StringUtils;

@Getter
@AllArgsConstructor
public enum OrderStatus {
    CREATED("Created", "order.created"),
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

    public static OrderStatus fromEvent(String eventType) {
        if (StringUtils.isEmpty(eventType)) {
            return null;
        }

        for (OrderStatus curStatus : OrderStatus.values()) {
            if (curStatus.getEvent().equalsIgnoreCase(eventType)) {
                return curStatus;
            }
        }

        return null;
    }
}
