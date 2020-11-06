package com.stanzaliving.core.po.generic.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum  GenericPOType {
    NON_RENTAL("Non-Rental Items/ Service PO"),
    RENTAL("Rental Items PO");

    private String poTypeText;
}
