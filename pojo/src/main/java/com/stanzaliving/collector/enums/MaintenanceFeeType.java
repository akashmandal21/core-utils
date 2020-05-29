package com.stanzaliving.collector.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MaintenanceFeeType {
    ONE_TIME_UPFRONT(0),MONTHLY(1);
    int maintenanceFeeType;
}
