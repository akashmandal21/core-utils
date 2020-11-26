package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.cafe.enums.CafeMenuCopyOption;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum DispatchMode {
    SELF_USER("Resident/User"),
    OPERATIONS_TEAM("Operations Team"),
    RC("RC"),
    VENDOR("Vendor");

    private final String mode;

    private static final List<EnumListing<DispatchMode>> enumListing = new ArrayList<>();

    public static List<EnumListing<DispatchMode>> getEnumListing() {
        return enumListing;
    }

    static {
        for (DispatchMode curOption : DispatchMode.values()) {
            EnumListing<DispatchMode> listing = EnumListing.of(curOption, curOption.getMode());
            enumListing.add(listing);
        }
    }

}
