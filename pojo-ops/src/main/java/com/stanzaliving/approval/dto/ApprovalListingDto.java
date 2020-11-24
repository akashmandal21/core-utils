package com.stanzaliving.approval.dto;

import com.stanzaliving.approval.enums.ApprovalEntityType;
import com.stanzaliving.approval.enums.ApprovalStatus;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ApprovalListingDto {

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

}
