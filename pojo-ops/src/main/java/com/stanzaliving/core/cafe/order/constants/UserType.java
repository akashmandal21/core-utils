package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum UserType {
    RESIDENT("Resident"),
    NON_RESIDENT("Non Resident");

    private final String type;

    private static final List<EnumListing<UserType>> enumListing = new ArrayList<>();

    public static List<EnumListing<UserType>> getEnumListing() {
        return enumListing;
    }

    static {
        for (UserType curOption : UserType.values()) {
            EnumListing<UserType> listing = EnumListing.of(curOption, curOption.getType());
            enumListing.add(listing);
        }
    }
}
