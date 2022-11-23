package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum RefundType {
    FULL_REFUND("Full Refund"),
    PARTIAL_REFUND("Partial Refund"),
    NO_REFUND("No Refund");

    private final String type;

    private static final List<EnumListing<RefundType>> enumListing = new ArrayList<>();

    public static List<EnumListing<RefundType>> getEnumListing() {
        return enumListing;
    }

    static {
        for (RefundType curOption : RefundType.values()) {
            EnumListing<RefundType> listing = EnumListing.of(curOption, curOption.getType());
            enumListing.add(listing);
        }
    }
}
