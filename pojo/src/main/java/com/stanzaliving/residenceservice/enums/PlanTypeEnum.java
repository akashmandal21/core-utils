package com.stanzaliving.residenceservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PlanTypeEnum {

    PREPAID("prepaid"),
    POSTPAID("postpaid");

    private final String label;
}
