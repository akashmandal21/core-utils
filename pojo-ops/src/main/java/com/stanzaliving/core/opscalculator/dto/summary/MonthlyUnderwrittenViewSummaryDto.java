package com.stanzaliving.core.opscalculator.dto.summary;

import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MonthlyUnderwrittenViewSummaryDto {
    private List<MonthUnderwrittenSummaryDto> monthWiseUnderwrittenSummaryDtoList;
    private DeviationPercentSummaryDto deviationPercent;
    private DisplaySummaryDto overallAmount;
    private Double overallCostPerAvailableBedPerMonth;
    private Double percentDeviation;

    private String commentUuid;
    private String residenceUuid;
    private String seasonUuid;
    private String monthlyUnderWrittenUuid;
    private String annualUnderWrittenUuid;
    private UnderWrittenStatus underWrittenStatus;
    private String pendingApprovalFrom;
    private String approvalStatus;
    private String bgColorCode;
    private String textColorCode;
    private LocalDate editFromDate;
}
