package com.stanzaliving.core.opscalculator.dto.response;

import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class MonthlyUnderWrittenVersionHistoryDto {
    private String versionName;
    private LocalDate submittedOn;
    private String monthlyUnderwrittenUuid;
    private UnderWrittenStatus status;
    private int monthNumber;
    private int year;
}