package com.stanzaliving.core.cafe.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CafeSlotCopyOption {
    ONLY_SLOT("Only Slot"),
    SLOT_WITH_MENU("Slot With Menu");

    private final String option;
}
