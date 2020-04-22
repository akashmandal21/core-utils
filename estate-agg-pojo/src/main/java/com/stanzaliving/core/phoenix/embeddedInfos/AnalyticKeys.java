package com.stanzaliving.core.phoenix.embeddedInfos;

import com.stanzaliving.core.projectservice.enums.ProjectSummaryStatus;
import com.stanzaliving.core.projectservice.enums.PropertyStatus;
import com.stanzaliving.po.enums.POSummaryStatus;
import com.stanzaliving.po.enums.PoType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnalyticKeys {
    private PropertyStatus propertyStatus;
    private ProjectSummaryStatus projectSummaryStatus;
    private Double siteCompletionPct; //Based on Sub Step completion
    private LocalDate expectedLandLordHandoverDate;
    private LocalDate expectedOpsHandoverDate;
    private LocalDate liveDate;
    private Map<PoType, POSummaryStatus> poTypeSummaryStatus;
}
