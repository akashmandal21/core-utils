package com.stanzaliving.approve.dto.approval_request;

import com.stanzaliving.approve.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApprovalSummaryDto {
    private String key;
    private String displayName;
    private Long value;
}
