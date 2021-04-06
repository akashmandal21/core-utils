package com.stanzaliving.core.opscalculator.dto.summary;

import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Data
@SuperBuilder
@NoArgsConstructor
public class MonthlyUnderwrittenForecastSummaryDto {
    private List<MonthUnderwrittenSummaryDto> monthWiseUnderwrittenSummaryDtoList;
    private MonthUnderwrittenSummaryDto deviationPercent;
    private DisplaySummaryDto overallAmount;
    private Double overallCostPerAvailableBedPerMonth;
    private Double percentDeviation;

    private String residenceUuid;
    private String seasonUuid;
    private List<String> annualUnderWrittenUuid;
    private List<String> monthlyUnderWrittenUuid;
}
