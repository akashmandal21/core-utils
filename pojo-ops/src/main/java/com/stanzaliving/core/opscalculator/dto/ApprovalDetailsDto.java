package com.stanzaliving.core.opscalculator.dto;

import com.stanzaliving.core.opscalculator.enums.ApprovalStatus;
import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalDetailsDto {

    private String underWrittenUuid;

    private String propertyName;

    private String microMarketName;

    private String cityName;

    private LocalDate underwrittenFromDate;

    private LocalDate underwrittenToDate;

    private Integer underWrittenDays;

    private LocalDate submittedOn;

    private String submittedBy;

    private UnderWrittenStatus underWrittenStatus;

    private ApprovalStatus approvalStatus;

    private Integer PendingApprovalDays;

    private Integer residenceCount;

    private String pendingFromText;

}
