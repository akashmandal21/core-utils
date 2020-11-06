package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ServingMode {
    PICK_UP("Pick Up"),
    DINE_IN("Dine In"),
    DELIVERY("Delivery");

    private final String mode;
}
