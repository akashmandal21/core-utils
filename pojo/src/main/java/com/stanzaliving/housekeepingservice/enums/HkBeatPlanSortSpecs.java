package com.stanzaliving.housekeepingservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Vikas S T
 * @date 13-Nov-21
 **/
@Getter
@AllArgsConstructor
public enum HkBeatPlanSortSpecs {
    START_DATE("startDate"),
    MICROCLUSTER("microClusterUuid"),
    CREATED_BY("createdBy"),
    UPDATED_BY("updatedBy"),
    STATUS("planStatus");

    private String dbKey;
}
