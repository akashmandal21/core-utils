package com.stanzaliving.generictaskservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Vikas S T
 * @date 02-Aug-21
 **/

@Getter
@AllArgsConstructor
public enum SlotType {
    TASK("TASK"),NON_TASK("NON_TASK");

    private String slotTypeName;

    private static final SortedMap<String, SlotType> slotMap = new TreeMap<String, SlotType>();
    
    static {
        for (SlotType slotType : SlotType.values()) {
            slotMap.put(slotType.getSlotTypeName(), slotType);
        }
    }

    public static Collection<SlotType> getSlotType() {
        return slotMap.values();
    }
}
