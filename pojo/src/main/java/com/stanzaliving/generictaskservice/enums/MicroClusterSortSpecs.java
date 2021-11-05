package com.stanzaliving.generictaskservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MicroClusterSortSpecs {

    UUID("uuid"),
    NAME("microClusterName"),
    CITY("cityName"),
    CITYUUID("cityUuid"),
    STATUS("microClusterStatus"),
    CREATEDBY("createdBy"),
    UPDATEDAT("updatedAt");

    private String dbKey;

}

