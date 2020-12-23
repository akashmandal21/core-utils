package com.stanzaliving.core.cafe.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum CafeMenuCopyOption {
    DAY("day"), WEEK("week");
    private final String option;

    private static final List<EnumListing<CafeMenuCopyOption>> enumListing = new ArrayList<>();

    public static List<EnumListing<CafeMenuCopyOption>> getEnumListing() {
        return enumListing;
    }

    static {
        for (CafeMenuCopyOption curOption : CafeMenuCopyOption.values()) {
            EnumListing<CafeMenuCopyOption> listing = EnumListing.of(curOption, curOption.getOption());
            enumListing.add(listing);
        }
    }
}
