package com.stanzaliving.food.v2.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ThaliType {
    NORMAL("Normal"),
    COMBO("Combo"),
    TIFFIN("Tiffin");
    private final String type;
}
