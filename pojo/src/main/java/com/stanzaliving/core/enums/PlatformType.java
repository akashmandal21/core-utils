package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum PlatformType {
    ALL("ALL"),
    SIGMA("SIGMA"),
    ALFRED("ALFRED");

    public String platform;

    public String getDescription() {
        return platform;
    }
}