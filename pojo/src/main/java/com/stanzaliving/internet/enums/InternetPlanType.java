package com.stanzaliving.internet.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InternetPlanType {

    ADD_ON("addOn"),
    BASE("Base");

    private String planType;

}
