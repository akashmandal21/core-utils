package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum Status {
    OPEN("OPEN"),
    IN_PROGRESS("IN PROGRESS"),
    WAITING_ON_CUSTOMER("WAITING ON CUSTOMER"),
    REOPEN("REOPEN"),
    CLOSED("CLOSED"),
    RESOLVED("RESOLVED"),
    PENDING("PENDING"),
    DELAYED("DELAYED"),
    COMPLETED("COMPLETED"),
    MERGED("MERGED");

    private final String value;

    private static final Map<String, Status> map = new HashMap<>();

    public static Status enumOf(String source) {
        return map.get(source);
    }

    @Override
    public String toString() {
        return value;
    }

}
