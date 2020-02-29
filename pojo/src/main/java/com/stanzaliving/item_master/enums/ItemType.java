package com.stanzaliving.item_master.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ItemType {

    BOI("BOI Items"),
    GC("GC Work"),
    ASIS("AsIs Work"),
    OTHER("Others");

    private String typeText;
}
