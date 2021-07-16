package com.stanzaliving.core.security.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum StatusCard {
    PRESENT,
    PENDING,
    NOT_PRESENT,
    NODAL_ACTION_TAKEN,
    PENDING_ACTION;

    public static List<StatusCard> getPresentPendingStatusList() {
        return new ArrayList<>(Arrays.asList(StatusCard.PENDING, StatusCard.PRESENT));
    }
}
