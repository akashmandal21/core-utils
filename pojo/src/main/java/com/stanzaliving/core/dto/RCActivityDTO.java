package com.stanzaliving.core.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.core.enums.ApprovalStatus;
import com.stanzaliving.core.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RCActivityDTO {
    DocumentTypeEnum documentType;

    String BookingUuid;

    Boolean isVerified;

    ApprovalStatus approvalStatus;

    String updatedBy;

    String updatedAt;

    String rejectionReason;
}
