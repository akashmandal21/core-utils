package com.stanzaliving.core.opscalculator.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class MonthlyUnderWrittenListingResponseDto {
    String versionName;
    Integer versionNumber;
    String seasonDisplayName;
    String status;
    String textColor;
    String bgColor;
    LocalDate fromDate;
    LocalDate toDate;
    String monthlyUnderWrittenUuid;
    LocalDate editFromDate;
    String annualUnderWrittenUuid;
    String annualUnderWrittenVersionName;
    Integer annualUnderWrittenVersionNumber;
}
