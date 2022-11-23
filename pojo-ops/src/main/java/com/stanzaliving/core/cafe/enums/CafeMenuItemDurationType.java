package com.stanzaliving.core.cafe.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CafeMenuItemDurationType {
    LAST_7_DAYS("Last 7 Days"),
    LAST_4_WEEKS("Last 4 Weeks");
    private final String type;
}
