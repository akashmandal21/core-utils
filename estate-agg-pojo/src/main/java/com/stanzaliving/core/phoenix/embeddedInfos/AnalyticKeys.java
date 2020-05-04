package com.stanzaliving.core.phoenix.embeddedinfos;

import com.stanzaliving.core.projectservice.enums.ProjectSummaryStatus;
import com.stanzaliving.core.projectservice.enums.PropertyStatus;
import com.stanzaliving.po.enums.POSummaryStatus;
import com.stanzaliving.po.enums.PoType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.LocalDate;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AnalyticKeys {
    @Indexed
    private PropertyStatus propertyStatus;
    @Indexed
    private ProjectSummaryStatus projectSummaryStatus;
    @Indexed
    private Integer siteCompletionPct; //Based on Sub Step completion
    @Indexed
    private LocalDate expectedLandLordHandoverDate;
    private LocalDate expectedOpsHandoverDate;
    @Indexed
    private LocalDate liveDate;
    private Map<PoType, POSummaryStatus> poTypeSummaryStatus;
}
