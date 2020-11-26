package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum NotificationType {
    EMAIL("Email"),
    SMS("SMS"),
    WHATSAPP_ALERT("Whatsapp Alert"),
    DEVICE_ALERT("Device Alert");

    private final String type;

    private static final List<EnumListing<NotificationType>> enumListing = new ArrayList<>();

    public static List<EnumListing<NotificationType>> getEnumListing() {
        return enumListing;
    }

    static {
        for (NotificationType curOption : NotificationType.values()) {
            EnumListing<NotificationType> listing = EnumListing.of(curOption, curOption.getType());
            enumListing.add(listing);
        }
    }
}
