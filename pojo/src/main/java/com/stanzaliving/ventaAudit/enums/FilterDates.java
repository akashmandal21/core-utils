package com.stanzaliving.ventaAudit.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public enum FilterDates {
        TOMORROW(1L),
        SEVEN_DAYS( 7L),
        FIFTEEN_DAYS(15L),
        THIRTY_DAYS(30L);
        private final Long filterDates;
}
