package com.stanzaliving.core.client.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum KeyHandOver {

    PENDING("Pending", "PENDING"),
    HANDED_OVER("Handed Over", "HANDED OVER"),
    KEY_LOST("Key Lost", "KEY LOST");

    String displayText;

    String tagText;

    private static List<Object> roomHandoverList = new ArrayList<>();

    static {

        for (KeyHandOver keyHandOver : KeyHandOver.values()) {
            if(!KeyHandOver.PENDING.equals(keyHandOver)){
                Map<String, String> roomHandoverMap = new HashMap<>();
                roomHandoverMap.put("key", keyHandOver.name());
                roomHandoverMap.put("value", keyHandOver.getDisplayText());
                roomHandoverList.add(roomHandoverMap);
            }
        }

    }

    public static List<Object> getRoomHandoverList() {
        return roomHandoverList;
    }

}
