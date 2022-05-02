package com.stanzaliving.approval.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.approval.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApprovalResponseDto {
    @NotBlank(message = "entityUuid cannot be blank")
    String entityUuid;

    @NotNull(message = "approvalEntityType cannot be null")
    ApprovalEntityType approvalEntityType;

    @NotNull(message = "approvalEntityType cannot be null")
    ApprovalStatus approvalStatus;

    Date approvedAt;

    String approvedBy;

}
