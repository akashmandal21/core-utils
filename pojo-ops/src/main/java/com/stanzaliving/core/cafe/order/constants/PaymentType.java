package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum PaymentType {
    PREPAID("Prepaid"),
    POSTPAID("Postpaid");
    private final String type;

    private static final List<EnumListing<PaymentType>> enumListing = new ArrayList<>();

    public static List<EnumListing<PaymentType>> getEnumListing() {
        return enumListing;
    }

    static {
        for (PaymentType curOption : PaymentType.values()) {
            EnumListing<PaymentType> listing = EnumListing.of(curOption, curOption.getType());
            enumListing.add(listing);
        }
    }
}
