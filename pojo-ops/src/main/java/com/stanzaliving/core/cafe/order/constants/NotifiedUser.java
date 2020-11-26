package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum NotifiedUser {
    USER("User"),
    CAFE_TEAM("Cafe Team"),
    KITCHEN_TEAM("Kitchen Team"),
    RC("RC"),
    DISPATCH_USER("Dispatch User"),
    OPS_TEAM("Operations Team");
    private final String user;

    private static final List<EnumListing<NotifiedUser>> enumListing = new ArrayList<>();

    public static List<EnumListing<NotifiedUser>> getEnumListing() {
        return enumListing;
    }

    static {
        for (NotifiedUser curOption : NotifiedUser.values()) {
            EnumListing<NotifiedUser> listing = EnumListing.of(curOption, curOption.getUser());
            enumListing.add(listing);
        }
    }


}
