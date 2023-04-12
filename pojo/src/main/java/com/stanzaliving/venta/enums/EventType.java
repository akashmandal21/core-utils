package com.stanzaliving.venta.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EventType {
    FOOD_RECEIVING,
    SUPPORT,
    POLICE_VERIFICATION,
    COMPLETE_EXIT,
    COMPLETE_AUDIT,
    MONTHLY_RENT,
    RENEW_CONTRACT;
}