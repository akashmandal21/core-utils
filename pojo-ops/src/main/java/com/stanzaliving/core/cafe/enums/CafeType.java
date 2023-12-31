package com.stanzaliving.core.cafe.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum CafeType {

    IN_HOUSE("In House"),
    EXTERNAL_CAFE("External Cafe");

    private String cafeTypeName;

    private static final List<EnumListing<CafeType>> enumListing = new ArrayList<>();

    public static List<EnumListing<CafeType>> getEnumListing() {
        return enumListing;
    }

    static {
        for (CafeType cafeType : CafeType.values()) {
            EnumListing<CafeType> listing = EnumListing.of(cafeType, cafeType.getCafeTypeName());
            enumListing.add(listing);
        }
    }

}