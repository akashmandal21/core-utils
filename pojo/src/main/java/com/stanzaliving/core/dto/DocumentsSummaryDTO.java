package com.stanzaliving.core.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentsSummaryDTO {

    private Long totalCount = 0L;

    private Long pendingCount = 0L;

    private Long autoApprovedCount = 0L;

    private Long manuallyApprovedCount = 0L;

    private Long rejectedCount = 0L;
}