package com.stanzaliving.core.cafe.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum CafeSlotCopyOption {
    ONLY_SLOT("Only Slot"),
    SLOT_WITH_MENU("Slot With Menu");

    private final String option;

    private static final List<EnumListing<CafeSlotCopyOption>> enumListing = new ArrayList<>();

    public static List<EnumListing<CafeSlotCopyOption>> getEnumListing() {
        return enumListing;
    }

    static {
        for (CafeSlotCopyOption curOption : CafeSlotCopyOption.values()) {
            EnumListing<CafeSlotCopyOption> listing = EnumListing.of(curOption, curOption.getOption());
            enumListing.add(listing);
        }
    }
}
