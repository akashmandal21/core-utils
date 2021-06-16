package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CommercialCodeType {

    CITY("CITY"),
    RESIDENCE("RESIDENCE"),
    MICROMARKET("MICROMARKET"),
    CONTRACTTENURE("CONTRACT TENURE"),
    LOCKIN("LOCK IN");


    String name;
}