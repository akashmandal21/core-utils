package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum OrderType {
    ALA_CARTE("Ala-Carte"),
    BATCH("Batch");

    private final String type;

    private static final List<EnumListing<OrderType>> enumListing = new ArrayList<>();

    public static List<EnumListing<OrderType>> getEnumListing() {
        return enumListing;
    }

    static {
        for (OrderType curOption : OrderType.values()) {
            EnumListing<OrderType> listing = EnumListing.of(curOption, curOption.getType());
            enumListing.add(listing);
        }
    }
}
