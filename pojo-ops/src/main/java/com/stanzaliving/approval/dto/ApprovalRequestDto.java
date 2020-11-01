package com.stanzaliving.approval.dto;

import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.approval.enums.ApprovalStatus;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.HashMap;

@Data
@Builder
public class ApprovalRequestDto {
    
    Date requestTime;

    String requestedBy;

    String entityUuid;

    String entityName;

    Integer versionNumber;

    ApprovalEntityType approvalEntityType;

    HashMap<String, Object> metadata;

    String l1ApprovalRole;

    String l2ApprovalRole;

    String l3ApprovalRole;
    
    ApprovalStatus approvalStatus;

    String residenceUuid;
    
}
