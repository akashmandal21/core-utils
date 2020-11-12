package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DispatchMode {
    SELF_USER("Resident/User"),
    OPERATIONS_TEAM("Operations Team"),
    RC("RC"),
    VENDOR("Vendor");

    private final String mode;

}
