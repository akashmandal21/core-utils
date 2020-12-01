package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum OrderStatus {
    CREATED("Created", "order.created"),
    PLACED("Placed", "order.placed"),
    CONFIRMED("Confirmed", "order.confirmed"),
    PREPARING("Preparing", "order.preparing"),
    PREPARED("Prepared", "order.prepared"),
    PACKED("Packed", "order.packed"),
    DISPATCHED("Dispatched", "order.dispatched"),
    DELIVERED("Delivered", "order.delivered"),
    CANCELLED("Cancelled", "order.cancelled");

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

    public static List<OrderStatus> pendingStatus() {
        List<OrderStatus> statuses = new ArrayList<>();
        statuses.add(PLACED);
        statuses.add(CONFIRMED);
        statuses.add(PREPARING);
        statuses.add(PREPARED);
        statuses.add(PACKED);
        statuses.add(DISPATCHED);
        return statuses;
    }

    private static final List<EnumListing<OrderStatus>> enumListing = new ArrayList<>();

    public static List<EnumListing<OrderStatus>> getEnumListing() {
        return enumListing;
    }

    static {
        for (OrderStatus curOption : OrderStatus.values()) {
            EnumListing<OrderStatus> listing = EnumListing.of(curOption, curOption.getStatus());
            enumListing.add(listing);
        }
    }

    public static boolean isPending(OrderStatus status) {
        return pendingStatus().contains(status);
    }
}
