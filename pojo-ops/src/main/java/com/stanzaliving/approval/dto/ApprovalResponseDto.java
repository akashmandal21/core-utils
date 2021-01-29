package com.stanzaliving.approval.dto;

import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.approval.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalResponseDto {
    @NotBlank(message = "entityUuid cannot be blank")
    String entityUuid;

    @NotNull(message = "approvalEntityType cannot be null")
    ApprovalEntityType approvalEntityType;

    @NotNull(message = "approvalEntityType cannot be null")
    ApprovalStatus approvalStatus;

}
