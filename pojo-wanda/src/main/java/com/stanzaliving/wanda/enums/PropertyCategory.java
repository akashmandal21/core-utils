package com.stanzaliving.wanda.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PropertyCategory {
    SUITES("Suites"), STELLO("Stello");
    String name;
}
