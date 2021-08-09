package com.stanzaliving.community.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Toggle {
    SOLD_OUT("Sold Out"),
    LIMITED_SEATS_AVAILABLE("Limited Seats Available");

    private final String name;
}

