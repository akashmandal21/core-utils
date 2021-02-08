package com.stanzaliving.approval.dto;

import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.approval.enums.ApprovalStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashMap;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalRequestDto {

    private Date requestTime;

    private String requestedBy;

    private String entityUuid;

    private String entityName;

    private Integer versionNumber;

    private ApprovalEntityType approvalEntityType;

    private HashMap<String, Object> metadata;

    private boolean l1ApprovalRequired;

    private boolean l2ApprovalRequired;

    private boolean l3ApprovalRequired;

    private boolean l4ApprovalRequired;

    private boolean l5ApprovalRequired;

    private ApprovalStatus approvalStatus;

    private String residenceUuid;

    private String cityUuid;

    private String micromarketUuid;
    
    private boolean expressApprovalRequired;
}