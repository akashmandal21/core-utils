package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum NotificationType {
    EMAIL("Email"),
    SMS("SMS"),
    WHATSAPP_ALERT("Whatsapp Alert"),
    DEVICE_ALERT("Device Alert");

    private final String type;
}
