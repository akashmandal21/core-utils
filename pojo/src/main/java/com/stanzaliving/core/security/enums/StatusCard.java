package com.stanzaliving.core.security.enums;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public enum StatusCard {
    PRESENT("PRESENT"),
    PENDING("PENDING"),
    NOT_PRESENT("NOT PRESENT"),
    NODAL_ACTION_TAKEN("NODAL ACTION TAKEN"),
    IN_PROPERTY("IN PROPERTY"),
    PENDING_ACTION("PENDING ACTION"),
    PENDING_BEFORE_RC_TIME("PENDING BEFORE RC TIME"),
    LEAVE_LATE_ENTRY("LEAVE_LATE_ENTRY"),
    OPTED_OUT("OPTED_OUT");

    public final String label;

    StatusCard(String label) {
        this.label = label;
    }

    public static List<String> getStatusList() {
        return new ArrayList<>(
                Arrays.asList(
                        StatusCard.PRESENT.name(),
                        StatusCard.PENDING.name(),
                        StatusCard.IN_PROPERTY.name(),
                        StatusCard.NODAL_ACTION_TAKEN.name()));
    }
}
