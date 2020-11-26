package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum ItemType {
    VAS("Vas Item"),
    COUPON("Coupon");

    private final String type;

    private static final List<EnumListing<ItemType>> enumListing = new ArrayList<>();

    public static List<EnumListing<ItemType>> getEnumListing() {
        return enumListing;
    }

    static {
        for (ItemType curOption : ItemType.values()) {
            EnumListing<ItemType> listing = EnumListing.of(curOption, curOption.getType());
            enumListing.add(listing);
        }
    }
}
