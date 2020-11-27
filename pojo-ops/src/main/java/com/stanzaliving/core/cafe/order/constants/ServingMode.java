package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ServingMode {
    PICK_UP("Pick Up"),
    DINE_IN("Dine In"),
    DELIVERY("Delivery");

    private final String mode;

    private static final List<EnumListing<ServingMode>> enumListing = new ArrayList<>();

    public static List<EnumListing<ServingMode>> getEnumListing() {
        return enumListing;
    }

    static {
        for (ServingMode curOption : ServingMode.values()) {
            EnumListing<ServingMode> listing = EnumListing.of(curOption, curOption.getMode());
            enumListing.add(listing);
        }
    }
}
