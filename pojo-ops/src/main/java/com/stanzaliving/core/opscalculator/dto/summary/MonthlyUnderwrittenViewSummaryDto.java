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
}
