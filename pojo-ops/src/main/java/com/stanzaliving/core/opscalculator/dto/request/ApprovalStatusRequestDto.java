package com.stanzaliving.core.opscalculator.dto.request;

import com.stanzaliving.core.opscalculator.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApprovalStatusRequestDto {
    private String underWrittenUuid;

    private ApprovalStatus approvalStatus;
}
