package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum FaqStatus {
    APPROVED("APPROVED"),
    PENDING_APPROVAL("PENDING APPROVAL"),
    REJECTED("REJECTED"),
    IN_DRAFT("IN DRAFT");

    private final String value;

    private static final Map<String, FaqStatus> map = new HashMap<>();

    static {
        for (FaqStatus status : FaqStatus.values()) {
            map.put(status.value, status);
        }
    }

    public static FaqStatus enumOf(String status) {
        return map.get(status);
    }

    @Override
    public String toString() {
        return value;
    }
}
