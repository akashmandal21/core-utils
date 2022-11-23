package com.stanzaliving.community.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ActivityType {
    LIKE("like"),
    SHARE("share"),
    UNLIKE("unlike");

    private final String name;
}

