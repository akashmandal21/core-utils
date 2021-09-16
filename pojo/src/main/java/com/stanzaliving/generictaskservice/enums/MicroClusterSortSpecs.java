package com.stanzaliving.generictaskservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MicroClusterSortSpecs {

    CITYUUID("cityUuid"),
    UUID("uuid"),
    MICROCLUSTERNAME("microClusterName");

    private String dbKey;

}

