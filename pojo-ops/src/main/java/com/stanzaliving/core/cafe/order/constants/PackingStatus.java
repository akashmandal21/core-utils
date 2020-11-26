package com.stanzaliving.core.cafe.order.constants;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum PackingStatus {
    PACKED("Packed"),
    PENDING_PACK("Pending");
    private final String status;

    private static final List<EnumListing<PackingStatus>> enumListing = new ArrayList<>();

    public static List<EnumListing<PackingStatus>> getEnumListing() {
        return enumListing;
    }

    static {
        for (PackingStatus curOption : PackingStatus.values()) {
            EnumListing<PackingStatus> listing = EnumListing.of(curOption, curOption.getStatus());
            enumListing.add(listing);
        }
    }
}
