package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DeliveryType {
    NORMAL("Normal"),
    IN_ROOM("In Room");

    private final String type;
}
