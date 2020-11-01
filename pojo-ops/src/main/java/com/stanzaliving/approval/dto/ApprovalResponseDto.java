package com.stanzaliving.approval.dto;

import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.approval.enums.ApprovalStatus;
import lombok.Data;

@Data
public class ApprovalResponseDto {

    String entityUuid;

    ApprovalEntityType approvalEntityType;

    ApprovalStatus approvalStatus;

}
