package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum OrderSearchFilter {
    PENDING_DISPATCH("Pending Dispatch"),
    IN_ROOM_DELIVERY("In Room Delivery"),
    EXPRESS_DELIVERY("Express Delivery"),
    DISPATCHED("In Transit"),
    DELAYED("Delayed");

    private final String filter;

    private static final List<EnumListing<OrderSearchFilter>> enumListing = new ArrayList<>();

    public static List<EnumListing<OrderSearchFilter>> getEnumListing() {
        return enumListing;
    }

    static {
        for (OrderSearchFilter curOption : OrderSearchFilter.values()) {
            EnumListing<OrderSearchFilter> listing = EnumListing.of(curOption, curOption.getFilter());
            enumListing.add(listing);
        }
    }


    public static List<EnumListing<OrderSearchFilter>> getFilterForType(OrderSearchStatus searchStatus) {
        List<EnumListing<OrderSearchFilter>> filters = new ArrayList<>();
        switch (searchStatus) {
            case OPEN:
                filters.add(EnumListing.of(PENDING_DISPATCH, PENDING_DISPATCH.getFilter()));
                filters.add(EnumListing.of(IN_ROOM_DELIVERY, IN_ROOM_DELIVERY.getFilter()));
                filters.add(EnumListing.of(EXPRESS_DELIVERY, EXPRESS_DELIVERY.getFilter()));
                filters.add(EnumListing.of(DISPATCHED, DISPATCHED.getFilter()));
                filters.add(EnumListing.of(DELAYED, DELAYED.getFilter()));
                break;
            case COMPLETED:
            default:
                break;
        }
        return filters;
    }
}
