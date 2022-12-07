package com.stanzaliving.analytics_service.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InternetEvents {
    STATUS("Internet Status"),
    DATA_CONSUMED("Internet Data Consumed"),
    CURRENT_PLAN("Internet Current Plan"),
    BOOSTER_PACK_PURCHASED("Booster Pack Purchased"),
    BOOSTER_PACK_VALUE("Booster Pack Purchased Value"),
    ENABLED("Enabled"),
    DISABLED("Disabled"),
    DISABLED_MOVEOUT("Disabled Due To Move Out Or Booking Canceled");

    private String internetEvent;
}
