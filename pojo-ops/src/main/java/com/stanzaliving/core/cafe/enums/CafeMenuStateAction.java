package com.stanzaliving.core.cafe.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    private static final List<EnumListing<CafeMenuStateAction>> enumListing = new ArrayList<>();

    public static List<EnumListing<CafeMenuStateAction>> getEnumListing() {
        return enumListing;
    }

    static {
        for (CafeMenuStateAction curAction : CafeMenuStateAction.values()) {
            EnumListing<CafeMenuStateAction> listing = EnumListing.of(curAction, curAction.getAction());
            enumListing.add(listing);
        }
    }
}
