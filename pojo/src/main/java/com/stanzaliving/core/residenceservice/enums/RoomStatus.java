package com.stanzaliving.core.residenceservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum RoomStatus {

    AVAILABLE("available"),
    BLOCKED("blocked"),
    DEAD("dead"),
    SOLD_OUT("soldOut");

    private final String value;
    private static final Map<String, RoomStatus> map = new HashMap<>();

    static {
        for (RoomStatus roomStatus : RoomStatus.values()) {
            map.put(roomStatus.value, roomStatus);
        }
    }

    public static RoomStatus enumOf(String roomStatus) {
        return map.get(roomStatus);
    }
}
