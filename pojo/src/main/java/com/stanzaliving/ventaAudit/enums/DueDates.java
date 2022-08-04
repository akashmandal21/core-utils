package com.stanzaliving.ventaAudit.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum DueDates {
    DUE_TODAY("Due today"),
    DUE_TOMORROW("Due tomorrow"),
    DUE_IN_SEVEN_DAYS("Due in 7 days"),
    DUE_IN_FIFTEEN_DAYS("Due in 15 days"),
    DUE_IN_THIRTY_DAYS("Due in 30 days"),
    OVERDUE("Overdue");
    private final String dueDates;
}
