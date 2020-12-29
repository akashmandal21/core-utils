package com.stanzaliving.core.cafe.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum ItemListingMethod {
    RECOMMENDED("Recommended"),
    BEST_SELLING("Best Selling"),
    ALL("All");
    private final String method;

    private static final List<EnumListing<ItemListingMethod>> enumListing = new ArrayList<>();

    public static List<EnumListing<ItemListingMethod>> getEnumListing() {
        return enumListing;
    }

    static {
        for (ItemListingMethod curMethod : ItemListingMethod.values()) {
            EnumListing<ItemListingMethod> listing = EnumListing.of(curMethod, curMethod.getMethod());
            enumListing.add(listing);
        }
    }
}
