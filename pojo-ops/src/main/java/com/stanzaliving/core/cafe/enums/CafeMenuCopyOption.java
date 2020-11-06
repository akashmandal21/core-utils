package com.stanzaliving.core.cafe.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CafeMenuCopyOption {
    DAY("day"), WEEK("week");
    private final String option;
}
