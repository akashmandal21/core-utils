package com.stanzaliving.core.po.generic.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RefundableSDType {
    FLAT("Flat"),
    MONTH("Months");

    private String sdType;
}
