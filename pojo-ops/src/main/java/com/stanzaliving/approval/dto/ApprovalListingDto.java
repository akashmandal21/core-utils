package com.stanzaliving.approval.dto;

import com.stanzaliving.approval.enums.ApprovalStatus;
import com.stanzaliving.core.user.dto.response.UserContactDetailsResponseDto;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ApprovalListingDto implements Serializable {

    LocalDate requestTime;

    String requestedBy;

    String entityUuid;

    String entityName;

    Integer versionNumber;
    
    HashMap<String, Object> metadata;
    
    String l1ActionedBy;

    LocalDate l1ActionTime;

    String l2ActionedBy;

    LocalDate l2ActionTime;

    String l3ActionedBy;

    LocalDate l3ActionTime;
    
    String l4ActionedBy;
    LocalDate l4ActionTime;

    String l5ActionedBy;
    LocalDate l5ActionTime;

    ApprovalStatus approvalStatus;
    
    String approvalDisplayText;

    String bgColorCode;
    
    String textColorCode;
    
    String residenceUuid;

    String residenceName;

    String micromarketUuid;

    String micromarketName;

    String cityUuid;

    String cityName;

    protected LocalDate updatedAt;

    protected String updatedBy;
    
    String ageingDaysString;
    
    String possibleApproverString;

    boolean l1ApprovalRequired;

    boolean l2ApprovalRequired;

    boolean l3ApprovalRequired;
    boolean l4ApprovalRequired;
    boolean l5ApprovalRequired;

    private List<String> pendingApprovers;
    private List<String> pendingApproversEmails;
    private List<UserContactDetailsResponseDto> pendingUsers;

    private Date requestDateTime;
    private Date l1ActionDateTime;
    private Date l2ActionDateTime;
    private Date l3ActionDateTime;
    private Date l4ActionDateTime;
    private Date l5ActionDateTime;

    private String requestDateTimeLabel;
    private String l1ActionDateTimeLabel;
    private String l2ActionDateTimeLabel;
    private String l3ActionDateTimeLabel;
    private String l4ActionDateTimeLabel;
    private String l5ActionDateTimeLabel;

}
