package com.stanzaliving.projectplanningservice.enums;

import com.stanzaliving.core.user.enums.EnumListing;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public enum PlanningStatus {
    ACTIVE("active"),
    INACTIVE("inactive"),
    DRAFT("draft");

    private String status;

    private static final List<EnumListing<PlanningStatus>> enumListing = new ArrayList<>();

    public static List<EnumListing<PlanningStatus>> getEnumListing() {
        return enumListing;
    }

    static {
        for (PlanningStatus status : PlanningStatus.values()) {
            EnumListing<PlanningStatus> listing = EnumListing.of(status, status.getStatus());
            enumListing.add(listing);
        }
    }
}
