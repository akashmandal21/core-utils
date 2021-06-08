package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public interface DocumentsSummaryProjection {

    ApprovalStatus getApprovalStatus();

    Long getDocumentCount();
}