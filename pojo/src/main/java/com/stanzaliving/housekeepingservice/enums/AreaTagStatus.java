package com.stanzaliving.housekeepingservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Vikas S T
 * @date 17-Sep-21
 **/

@Getter
@AllArgsConstructor
public enum AreaTagStatus {
    ACTIVE("ACTIVE"),DISABLED("DISABLED");

    private static final SortedMap<String, AreaTagStatus> areaTagStatusMap = new TreeMap<String, AreaTagStatus>();

    static {
        for (AreaTagStatus slotType : AreaTagStatus.values()) {
            areaTagStatusMap.put(slotType.getAreaTagStatusName(), slotType);
        }
    }

    private String areaTagStatusName;

    public static Collection<AreaTagStatus> getAreaTagStatus() {
        return areaTagStatusMap.values();
    }

}
