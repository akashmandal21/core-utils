package com.stanzaliving.food.v2.common.constant;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum PackageLocationType {

    KITCHEN("Thali packaging to be done at kitchen"),
    RESIDENCE("Thali packaging to be done at residence");

    private String message;

    private final static List<EnumListing<PackageLocationType>> enumListings = new ArrayList<>();

    static {
        for (PackageLocationType packageLocationType : PackageLocationType.values()) {
            enumListings.add(EnumListing.of(packageLocationType, packageLocationType.getMessage()));
        }
    }

    public static List<EnumListing<PackageLocationType>> getEnumListings() {
        return enumListings;
    }

}
