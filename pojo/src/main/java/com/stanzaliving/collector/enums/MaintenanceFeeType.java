package com.stanzaliving.collector.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
@AllArgsConstructor
public enum MaintenanceFeeType {
    ONE_TIME_UPFRONT(0),MONTHLY(1);
    int maintenanceFeeType;

    private static final Map<Integer, MaintenanceFeeType> map = new HashMap<>();

    static {
        for (MaintenanceFeeType maintenanceFeeType : values()) map.put(maintenanceFeeType.getMaintenanceFeeType(), maintenanceFeeType);
    }

    public static MaintenanceFeeType getByMaintenanceFeeType(int id) {
        return map.get(id);
    }
}
