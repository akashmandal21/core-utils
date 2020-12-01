package com.stanzaliving.core.cafe.order.constants;

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

    public static List<EnumListing<DispatchMode>> getEnumListing(ServingMode mode) {
        List<EnumListing<DispatchMode>> enumListings = new ArrayList<>();
        switch (mode) {
            case DELIVERY:
                enumListings.add(EnumListing.of(OPERATIONS_TEAM, OPERATIONS_TEAM.getMode()));
                enumListings.add(EnumListing.of(RC, RC.getMode()));
                break;
            case PICK_UP:
                enumListings.add(EnumListing.of(SELF_USER, SELF_USER.getMode()));
                enumListings.add(EnumListing.of(OPERATIONS_TEAM, OPERATIONS_TEAM.getMode()));
                enumListings.add(EnumListing.of(RC, RC.getMode()));
                break;
            case DINE_IN:
                enumListings.add(EnumListing.of(SELF_USER, SELF_USER.getMode()));
                break;
            default:
                break;
        }
        return enumListings;
    }
}
