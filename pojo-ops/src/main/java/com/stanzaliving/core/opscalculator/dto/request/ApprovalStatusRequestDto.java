package com.stanzaliving.core.opscalculator.dto.request;

import com.stanzaliving.core.opscalculator.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ApprovalStatusRequestDto {
    @NotBlank(message = "undeWritten Uuid can not be null")
    private String underWrittenUuid;

    private ApprovalStatus approvalStatus;
}
