package com.stanzaliving.core.opscalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MonthDto {
    private int monthNumber;
    private int year;
    private Double cost;
    private String colorCode;
    private String status;
    private String monthlyUnderWrittenUUid;
    private boolean currentMonth;
}
