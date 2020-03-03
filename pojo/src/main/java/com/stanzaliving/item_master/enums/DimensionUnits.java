package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum DimensionUnits {

    INCH("inches"),
    METER("mts"),
    FOOT("ft"),
    CENTI("cm"),
    MILLIMETER("mm");

    private String dimUnit;
}
