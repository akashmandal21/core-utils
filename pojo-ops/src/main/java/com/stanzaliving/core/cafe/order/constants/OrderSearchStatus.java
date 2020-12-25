package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum OrderSearchStatus {
    OPEN("Open"),
    COMPLETED("Completed");

    private final String status;

    public static List<OrderStatus> getStatus(OrderSearchStatus searchStatus) {
        List<OrderStatus> status = new ArrayList<>();
        switch (searchStatus) {
            default:
                break;
            case OPEN:
                status.add(OrderStatus.PLACED);
                status.add(OrderStatus.CONFIRMED);
                status.add(OrderStatus.PREPARING);
                status.add(OrderStatus.PREPARED);
                status.add(OrderStatus.PACKED);
                status.add(OrderStatus.DISPATCHED);
                break;
            case COMPLETED:
                status.add(OrderStatus.RECEIVED);
                status.add(OrderStatus.DELIVERED);
                status.add(OrderStatus.CANCELLED);
                break;
        }
        return status;
    }

    private static final List<EnumListing<OrderSearchStatus>> enumListing = new ArrayList<>();

    public static List<EnumListing<OrderSearchStatus>> getEnumListing() {
        return enumListing;
    }

    static {
        for (OrderSearchStatus curOption : OrderSearchStatus.values()) {
            EnumListing<OrderSearchStatus> listing = EnumListing.of(curOption, curOption.getStatus());
            enumListing.add(listing);
        }
    }
}
