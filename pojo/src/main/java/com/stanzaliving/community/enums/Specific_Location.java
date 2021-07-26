package com.stanzaliving.community.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Specific_Location {
    CITY("city"),
    MICRO_MARKET("micromarket"),
    RESIDENCE("residence"),
    USER("user");

    private final String name;
}