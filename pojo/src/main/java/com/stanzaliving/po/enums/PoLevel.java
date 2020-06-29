package com.stanzaliving.po.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Getter
@NoArgsConstructor
public enum PoLevel {

    NATIONAL("National"),
    CITY("City"),
    MICROMARKET("Micro Market");

    private String level;

}
