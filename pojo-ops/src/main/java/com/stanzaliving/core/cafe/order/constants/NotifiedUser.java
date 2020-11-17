package com.stanzaliving.core.cafe.order.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum NotifiedUser {
    USER("User"),
    CAFE_TEAM("Cafe Team"),
    KITCHEN_TEAM("Kitchen Team"),
    RC("RC"),
    DISPATCH_USER("Dispatch User"),
    OPS_TEAM("Operations Team");
    private final String user;


}
