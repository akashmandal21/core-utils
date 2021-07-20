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
    PENDING_ACTION("PENDING ACTION");

    private final String label;

    private StatusCard(String label){
        this.label = label;
    }

    public static List<StatusCard> getPresentPendingStatusList() {
        return new ArrayList<>(Arrays.asList(StatusCard.PENDING, StatusCard.PRESENT));
    }
}
