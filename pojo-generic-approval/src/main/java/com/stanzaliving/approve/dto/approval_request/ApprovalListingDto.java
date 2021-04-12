package com.stanzaliving.approve.dto.approval_request;

import com.stanzaliving.approve.enums.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ApprovalListingDto {

    private HashMap<String, Object> metadata;

    private String entityUuid;

    private LocalDate requestTime;

    private String requestedBy;

    private String entityName;

    private String l1ActionedBy;

    private LocalDate l1ActionTime;

    private boolean l1ApprovalRequired;

    private String l2ActionedBy;

    private LocalDate l2ActionTime;

    private boolean l2ApprovalRequired;

    private String l3ActionedBy;

    private LocalDate l3ActionTime;

    private boolean l3ApprovalRequired;

    private String l4ActionedBy;

    private LocalDate l4ActionTime;

    private boolean l4ApprovalRequired;

    private String l5ActionedBy;

    private LocalDate l5ActionTime;

    private boolean l5ApprovalRequired;

    private ApprovalStatus approvalStatus;

    private String approvalDisplayText;

    private String bgColorCode;

    private String textColorCode;
}
