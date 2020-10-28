package com.stanzaliving.core.cafe.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.Arrays;

@Getter
@AllArgsConstructor
public enum CafeMenuStateAction {
    PAUSED("paused"),
    RESTARTED("re-started");

    private final String action;

    public static CafeMenuStateAction getActionFromState(String action) {
        if (StringUtils.isEmpty(action)) {
            return null;
        } else {
            return Arrays.stream(CafeMenuStateAction.values())
                    .filter(curRecord -> curRecord.getAction().equalsIgnoreCase(action)).findAny().orElse(null);
        }
    }
}
