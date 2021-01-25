package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DataUnit {

    BIT("BIT"),
    NIBBLE("NIBBLE"),
    BYTE("BYTE"),
    KILOBYTE("KB"),
    MEGABYTE("MB"),
    GIGABYTE("GB"),
    TERABYTE("TB"),
    PETABYTE("PB"),
    EXABYTE("EB"),
    ZETTABYTE("ZB"),
    YOTTABYTE("YB"),
    KB("KB"),
    MB("MB"),
    GB("GB"),
    TB("TB"),
    PB("PB"),
    EB("EB"),
    ZB("ZB"),
    YB("YB");

    private String dataUnit;
}
