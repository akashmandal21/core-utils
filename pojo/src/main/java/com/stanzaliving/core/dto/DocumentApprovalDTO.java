package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentApprovalDTO {
    @NotNull ApprovalStatus approvalStatus;
    // Note: needs conditional validation
    String reason;
}