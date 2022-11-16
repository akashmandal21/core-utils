package com.stanzaliving.supportclient.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum Priority {
    URGENT("URGENT", 3),
    HIGH("HIGH", 2),
    MEDIUM("MEDIUM", 1),
    LOW("LOW", 0);


    private static final Map<String, Priority> map = new HashMap<>();

    static {
        for (Priority priority : Priority.values()) {
            map.put(priority.value, priority);
        }
    }

    private final String value;

    private final int weight;


    public static Priority enumOf(String priority) {
        return map.get(priority);
    }

    public static Map<String, Priority> getMap() {
        return map;
    }

}
