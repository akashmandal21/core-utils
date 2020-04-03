package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ItemType {

    BOI("BOI"),
    GC("GC"),
    ASIS("As-Is"),
    OTHER("Others");

    private String typeText;
}
