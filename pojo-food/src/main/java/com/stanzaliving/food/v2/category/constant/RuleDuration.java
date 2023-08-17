package com.stanzaliving.food.v2.category.constant;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public enum RuleDuration {
    IN_WEEK("within the week"),
    IN_DAY("within a day"),
    CONSECUTIVE_MEALS("in consecutive meals"),
    CONSECUTIVE_DAYS("in consecutive days"),
    IN_MEAL("within the Meal");
//    IN_OPTIONS("within options")

    private final String rule;

    private final static List<EnumListing<RuleDuration>> enumListings = new ArrayList<>();

    static {
        for (RuleDuration curStatus : RuleDuration.values()) {
            enumListings.add(EnumListing.of(curStatus, curStatus.getRule()));
        }
    }

    public static List<EnumListing<RuleDuration>> getEnumListings() {
        return enumListings;
    }
}
