package com.stanzaliving.community.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SpecificLocation {
	
    CITY("city"),
    MICRO_MARKET("micromarket"),
    RESIDENCE("residence"),
    USER("user");

    private final String name;
}