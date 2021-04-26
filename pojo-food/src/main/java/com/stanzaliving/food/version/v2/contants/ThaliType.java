package com.stanzaliving.food.version.v2.contants;

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
