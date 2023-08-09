package com.stanzaliving.booking.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;


@AllArgsConstructor
@Getter
public enum AddOnStatus {

    INACTIVE("Inactive"),
    ACTIVE("Active"),
    DEPRECATED("Deprecated");

    private final String status;

    private static final Map<String, AddOnStatus> addOnStatusEnumHashMap = new HashMap<>();

    static {
        for (AddOnStatus addOnStatus : AddOnStatus.values()) {
            addOnStatusEnumHashMap.put(addOnStatus.status, addOnStatus);
        }
    }

    public static AddOnStatus getAddOnStatusEnum(String addOnStatus) {
        return addOnStatusEnumHashMap.get(addOnStatus);
    }

}
