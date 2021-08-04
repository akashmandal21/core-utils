package com.stanzaliving.community.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Toggle {
    SOLD_OUT("sold_out"),
    LIMITED_SEATS_AVAILABLE("limited_seats_available");

    private final String name;
}

