package com.stanzaliving.approve.dto.approval_request;

import com.stanzaliving.approve.enums.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalRequestDto {

    private Date requestTime;

    private String requestedBy;

    private String entityUuid;

    private String entityName;

    private HashMap<String, Object> metadata;

    private List<Map<String, String>> validation;

    private boolean l1ApprovalRequired;

    private boolean l2ApprovalRequired;

    private boolean l3ApprovalRequired;

    private boolean l4ApprovalRequired;

    private boolean l5ApprovalRequired;

    private ApprovalStatus approvalStatus;

    private String residenceUuid;

    private String cityUuid;

    private String micromarketUuid;

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