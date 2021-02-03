package com.stanzaliving.core.opscalculator.dto;

import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MonthDto {
    private String monthYear;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Double costPerAvailableBed;
    private String colorCode;
    private UnderWrittenStatus underWrittenStatus;
    private String monthlyUnderWrittenUuid;
}
