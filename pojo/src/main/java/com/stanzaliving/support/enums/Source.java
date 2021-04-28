package com.stanzaliving.support.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum Source {

    INTERNAL("Internal"),
    EXTERNAL("External");

    private static final Map<String, Source> map = new HashMap<>();

    static {
        for (Source source : Source.values()) {
            map.put(source.value, source);
        }
    }

    private final String value;

    public static Source enumOf(String source) {
        return map.get(source);
    }
}
