package com.stanzaliving.core.cafe.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  CafeMenuStateAction {
    PAUSED("paused"),
    RESTARTED("re-started");

    private String action;

}
