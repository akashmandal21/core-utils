package com.stanzaliving.item_master.enums;

import com.stanzaliving.transformations.enums.AreaOfUse;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@AllArgsConstructor
@Getter
public enum DimensionUnits {

    INCH("inches"),
    METER("mts"),
    FOOT("ft"),
    CENTI("cm"),
    MILLIMETER("mm");

    private String dimUnit;

    public static Map<String, DimensionUnits> dimensionUnitsMap = new HashMap<>();

    static {

        dimensionUnitsMap.put("inches", DimensionUnits.INCH);
        dimensionUnitsMap.put("mts", DimensionUnits.METER);
        dimensionUnitsMap.put("ft", DimensionUnits.FOOT);
        dimensionUnitsMap.put("cm", DimensionUnits.CENTI);
        dimensionUnitsMap.put("mm", DimensionUnits.MILLIMETER);
    }
}
