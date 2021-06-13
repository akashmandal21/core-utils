package com.stanzaliving.community.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ActivityType {
    LIKE("like"),
    SHARE("share");

    private final String name;
}

