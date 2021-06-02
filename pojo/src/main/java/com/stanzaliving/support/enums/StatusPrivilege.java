package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum StatusPrivilege {
    SYSTEM("System Activated"),
    USER("User Activated");

    private static final Map<String, StatusPrivilege> map = new HashMap<>();

    static {
        for (StatusPrivilege statusType : StatusPrivilege.values()) {
            map.put(statusType.value, statusType);
        }
    }

    private final String value;

    public static StatusPrivilege enumOf(String statusType) {
        return map.get(statusType);
    }
}
