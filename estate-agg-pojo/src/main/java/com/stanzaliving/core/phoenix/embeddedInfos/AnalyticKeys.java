package com.stanzaliving.core.phoenix.embeddedinfos;

import com.stanzaliving.core.agg.commons.EnumDecoder;
import com.stanzaliving.core.projectservice.enums.ProjectSummaryStatus;
import com.stanzaliving.core.projectservice.enums.PropertyStatus;
import com.stanzaliving.designservice.enums.PhoenixDesignStatus;
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
    private String propertyStatus; //Changed from Enum PropertyStatus to String
    @Indexed
    private String projectSummaryStatus;//Changed from Enum ProjectSummaryStatus to String
    @Indexed
    private Integer siteCompletionPct; //Based on Sub Step completion
    @Indexed
    private LocalDate expectedLandLordHandoverDate;
    private LocalDate expectedOpsHandoverDate;
    @Indexed
    private LocalDate liveDate;
    /*
    Map of PoType to PoSummary Status
     */
    private Map<String, String> poTypeSummaryStatus; //Changed from private Map<PoType, POSummaryStatus> poTypeSummaryStatus;

    public PropertyStatus getPropertyStatusEnum(){
        return EnumDecoder.getEnum(propertyStatus,PropertyStatus.class);
    }

    public ProjectSummaryStatus getProjectSummaryStatusEnum(){
        return EnumDecoder.getEnum(projectSummaryStatus,ProjectSummaryStatus.class);
    }
}
