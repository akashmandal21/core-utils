package com.stanzaliving.projectplanningservice.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum Duration {
    DAYS("days"),
    MONTHS("Months"),
    WEEKS("Weeks"),
    HOURS("Hours");

    private String unit;

    private static final List<EnumListing<Duration>> enumListing = new ArrayList<>();

    public static List<EnumListing<Duration>> getEnumListing() {
        return enumListing;
    }

    static {
        for (Duration duration : Duration.values()) {
            EnumListing<Duration> listing = EnumListing.of(duration, duration.getUnit());
            enumListing.add(listing);
        }
    }
}
