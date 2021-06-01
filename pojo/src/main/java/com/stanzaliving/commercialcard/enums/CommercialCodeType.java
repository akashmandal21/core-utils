package com.stanzaliving.commercialcard.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CommercialCodeType {

    CITY("CITY"), RESIDENCE("RESIDENCE"), MICROMARKET("MICROMARKET") ,CONTRACTTENURE("CONTRACT TENURE");

    String name;
}