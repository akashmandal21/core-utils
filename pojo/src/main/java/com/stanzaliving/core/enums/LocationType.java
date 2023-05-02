package com.stanzaliving.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LocationType {

    SOCIETY("Society"), STANDALONE_BUILDING("Standalone Building");

    private String locationTypeName;
}
