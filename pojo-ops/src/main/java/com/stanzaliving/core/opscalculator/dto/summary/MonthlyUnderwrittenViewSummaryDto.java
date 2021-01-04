package com.stanzaliving.core.opscalculator.dto.summary;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@AllArgsConstructor
@Data
@SuperBuilder
@NoArgsConstructor
public class MonthlyUnderwrittenViewSummaryDto {
    List<MonthUnderwrittenSummaryDto> monthWiseUnderwrittenSummaryDtoList;
    DeviationPercentSummaryDto deviationPercent;
    DisplaySummaryDto overallAmount;
    DisplaySummaryDto overallCostPerAvailableBedPerMonth;
    Double percentDeviation;

    String commentUuid;
    String residenceUuid;
    String seasonUuid;
    String monthlyUnderWrittenUuid;
    String annualUnderWrittenUuid;
    UnderWrittenStatus underWrittenStatus;
    private String pendingApprovalFrom;
    private String approvalStatus;
    private String bgColorCode;
    private String textColorCode;
}
