package com.stanzaliving.approval.dto;

import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.approval.enums.ApprovalStatus;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ApprovalResponseDto {
    @NotBlank(message = "entityUuid cannot be blank")
    String entityUuid;

    @NotNull(message = "approvalEntityType cannot be null")
    ApprovalEntityType approvalEntityType;

    @NotNull(message = "approvalEntityType cannot be null")
    ApprovalStatus approvalStatus;

}
