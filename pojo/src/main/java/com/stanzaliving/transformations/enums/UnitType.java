package com.stanzaliving.transformations.enums;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import lombok.Getter;

@Getter
public enum UnitType {

    NUMBER("nos."),
    METERS("mtrs"),
    CUBIT_FEET("cu.ft."),
    SQUARE_FEET("sq.ft."),
    KILOGRAM("kg"),
    RFT("Running Feet"),
    LS("Lump sum"),
    PER_BED("Per Bed"),
    MANDAYS("Mandays");

    private String unitName;

    private UnitType(String unitName) {
        this.unitName = unitName;
    }

    public static Map<String, UnitType> unitByNameMap = new HashMap<>();

    static {

        for (UnitType unitType : UnitType.values()) {
            unitByNameMap.put(unitType.getUnitName(), unitType);
        }
    }

    public static UnitType getUnitTypeByName(String unitName) {

        if (Objects.isNull(unitName))
            return null;

        return unitByNameMap.get(unitName);
    }

}