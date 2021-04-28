package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum StatusType {
    COMPLETED("Completed"),
    DELAYED("Delayed"),
    PENDING("Pending");

    private static final Map<String, StatusType> map = new HashMap<>();

    static {
        for (StatusType statusType : StatusType.values()) {
            map.put(statusType.value, statusType);
        }
    }

    private final String value;

    public static StatusType enumOf(String statusType) {
        return map.get(statusType);
    }
}