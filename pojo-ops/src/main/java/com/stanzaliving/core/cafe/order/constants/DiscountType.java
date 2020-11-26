package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum DiscountType {
    FLAT_AMOUNT("Flat"),
    PERCENTAGE("Percentage");
    private final String type;

    private static final List<EnumListing<DiscountType>> enumListing = new ArrayList<>();

    public static List<EnumListing<DiscountType>> getEnumListing() {
        return enumListing;
    }

    static {
        for (DiscountType curOption : DiscountType.values()) {
            EnumListing<DiscountType> listing = EnumListing.of(curOption, curOption.getType());
            enumListing.add(listing);
        }
    }
}
