package com.stanzaliving.analytics_service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InternetEvents {
    STATUS("Internet status"),
    DATA_CONSUMED("Internet data consumed"),
    CURRENT_PLAN("internet current plan"),
    BOOSTER_PACK_PURCHASED("Booster pack purchased"),
    BOOSTER_PACK_VALUE("Booster pack purchased value");

    private String internet_event;
}
