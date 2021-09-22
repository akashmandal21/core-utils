package com.stanzaliving.generictaskservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Vikas S T
 * @date 22-Sep-21
 **/
@Getter
@AllArgsConstructor
public enum SlotStatus {
    ACTIVE("ACTIVE"),INACTIVE("INACTIVE");

    private static final SortedMap<String, SlotStatus> slotStatusMap = new TreeMap<String, SlotStatus>();

    static {
        for (SlotStatus slotType : SlotStatus.values()) {
            slotStatusMap.put(slotType.getSlotStatusName(), slotType);
        }
    }

    private String slotStatusName;

    public static Collection<SlotStatus> getSlotStatus() {
        return slotStatusMap.values();
    }

}
