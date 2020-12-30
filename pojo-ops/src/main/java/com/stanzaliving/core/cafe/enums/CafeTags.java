package com.stanzaliving.core.cafe.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum CafeTags {

    CANTEEN("Canteen"),
    TUCK_SHOP("Tuck Shop");

    private String tagName;

    private static final List<EnumListing<CafeTags>> enumListing = new ArrayList<>();

    public static List<EnumListing<CafeTags>> getEnumListing() {
        return enumListing;
    }

    static {
        for (CafeTags tag : CafeTags.values()) {
            EnumListing<CafeTags> listing = EnumListing.of(tag, tag.getTagName());
            enumListing.add(listing);
        }
    }

}