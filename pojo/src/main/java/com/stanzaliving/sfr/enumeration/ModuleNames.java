package com.stanzaliving.sfr.enumeration;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum ModuleNames {

    SFR,
    ASIS;

    public static final List<ModuleNames> moduleNames = Arrays.asList(SFR, ASIS);

}
