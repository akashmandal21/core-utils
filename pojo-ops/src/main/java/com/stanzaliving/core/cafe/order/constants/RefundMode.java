package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum RefundMode {
    INSTANT("Instant"),
    ORIGINAL("Original");

    private final String mode;

    private static final List<EnumListing<RefundMode>> enumListing = new ArrayList<>();

    public static List<EnumListing<RefundMode>> getEnumListing() {
        return enumListing;
    }

    static {
        for (RefundMode curOption : RefundMode.values()) {
            EnumListing<RefundMode> listing = EnumListing.of(curOption, curOption.getMode());
            enumListing.add(listing);
        }
    }
}
