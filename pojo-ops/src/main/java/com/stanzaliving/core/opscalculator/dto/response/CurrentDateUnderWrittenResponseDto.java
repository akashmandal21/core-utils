package com.stanzaliving.core.opscalculator.dto.response;

import com.stanzaliving.core.enums.ResidenceBrand;
import com.stanzaliving.core.opscalculator.enums.ApprovalStatus;
import com.stanzaliving.core.opscalculator.enums.UnderWrittenStatus;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CurrentDateUnderWrittenResponseDto {
    private String seasonUuid;
    private String annualUnderWrittenUuid;
    private LocalDate fromDate;
    private LocalDate toDate;
    private String serviceMixVersion;
    private String residenceUuid;
    private String residenceName;
    private ResidenceBrand residenceBrand;
    private int bedCount;
    private int roomCount;
    private String status;
    private ApprovalStatus approvalStatus;
}
