package com.stanzaliving.approve.dto.approval_request;

import com.stanzaliving.approve.enums.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ApprovalListingDto {

    private HashMap<String, Object> metadata;

      private String entityUuid;

      private String requestTime;

      private String requestedBy;

      private String entityName;

    private ApprovalStatus approvalStatus;

    private String approvalDisplayText;

    private String bgColorCode;

    private String textColorCode;

    private String cardLeftMarginColorCode;

//    private String residenceUuid;
//
//    private String residenceName;
//
//    private String micromarketUuid;
//
//    private String micromarketName;
//
//    private String cityUuid;
//
//    private String cityName;
//
//    private LocalDate updatedAt;
//
//    private String updatedBy;

//    private Date requestDateTime;
//    private Date l1ActionDateTime;
//    private Date l2ActionDateTime;
//    private Date l3ActionDateTime;
//    private Date l4ActionDateTime;
//    private Date l5ActionDateTime;
//
//    private String requestDateTimeLabel;
//    private String l1ActionDateTimeLabel;
//    private String l2ActionDateTimeLabel;
//    private String l3ActionDateTimeLabel;
//    private String l4ActionDateTimeLabel;
//    private String l5ActionDateTimeLabel;
}
