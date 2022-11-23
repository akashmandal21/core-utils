package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentsSummaryProjection {

    private Long documentCount = 0L;

    private ApprovalStatus approvalStatus;
}