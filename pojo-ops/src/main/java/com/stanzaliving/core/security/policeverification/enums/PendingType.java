package com.stanzaliving.core.security.policeverification.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PendingType {

    S("S", "System Pending"),
    N("N", "Nodal Pending"),
    R("R", "RC Pending"),
    L("L","Legal Pending"),
    ALL("ALL","ALL");;

    private final String key;
    private final String value;

}
