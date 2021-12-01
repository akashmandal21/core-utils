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
    MICROMARKETUUID("micromarketUuid"),
    MICROMARKETNAME("micromarketName"),
    CREATEDBY("createdBy"),
    UPDATEDAT("updatedAt");

    private String dbKey;

}

