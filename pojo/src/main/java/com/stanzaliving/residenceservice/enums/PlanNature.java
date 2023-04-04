package com.stanzaliving.residenceservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PlanNature {
    ADDITIVE("Additive"),
    UPDATE("Update");

    private String planNature;

}
