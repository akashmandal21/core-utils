package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum PaymentStatus {
    PAID("Paid"),
    PENDING("Pending");

    private final String status;

    private static final List<EnumListing<PaymentStatus>> enumListing = new ArrayList<>();

    public static List<EnumListing<PaymentStatus>> getEnumListing() {
        return enumListing;
    }

    static {
        for (PaymentStatus curOption : PaymentStatus.values()) {
            EnumListing<PaymentStatus> listing = EnumListing.of(curOption, curOption.getStatus());
            enumListing.add(listing);
        }
    }
}
