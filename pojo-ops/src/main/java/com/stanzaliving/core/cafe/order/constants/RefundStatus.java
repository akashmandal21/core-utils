package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum RefundStatus {
    TO_BE_REFUND("To Be Refund"),
    INITIATED("Initiated"),
    PENDING("Pending"),
    COMPLETED("Completed"),
    FAILED("Failed");

    private final String status;

    private static final List<EnumListing<RefundStatus>> enumListing = new ArrayList<>();

    public static List<EnumListing<RefundStatus>> getEnumListing() {
        return enumListing;
    }

    static {
        for (RefundStatus curOption : RefundStatus.values()) {
            EnumListing<RefundStatus> listing = EnumListing.of(curOption, curOption.getStatus());
            enumListing.add(listing);
        }
    }
}
