package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum DeliveryType {
    NORMAL("Normal"),
    IN_ROOM("In Room");

    private final String type;

    private static final List<EnumListing<DeliveryType>> enumListing = new ArrayList<>();

    public static List<EnumListing<DeliveryType>> getEnumListing() {
        return enumListing;
    }

    static {
        for (DeliveryType curOption : DeliveryType.values()) {
            EnumListing<DeliveryType> listing = EnumListing.of(curOption, curOption.getType());
            enumListing.add(listing);
        }
    }
}
