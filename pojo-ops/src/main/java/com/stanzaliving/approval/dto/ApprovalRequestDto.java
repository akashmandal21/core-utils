package com.stanzaliving.approval.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.approval.enums.ApprovalStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalRequestDto implements Serializable {

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

    private String l1ActionedBy;

    private Date l1ActionTime;

    private String l2ActionedBy;

    private Date l2ActionTime;

    private String l3ActionedBy;

    private Date l3ActionTime;

    private String l4ActionedBy;

    private Date l4ActionTime;

    private String l5ActionedBy;

    private Date l5ActionTime;
}