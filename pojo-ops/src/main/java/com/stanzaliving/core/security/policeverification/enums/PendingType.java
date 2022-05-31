package com.stanzaliving.core.security.policeverification.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PendingType {

    S("S", "System"),
    N("N", "Nodal Team"),
    R("R", "Residence Caption"),
    L("L","Legal Team"),
    ALL("ALL","ALL");;

    private final String key;
    private final String value;

}
