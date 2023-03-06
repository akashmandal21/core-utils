package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.ApprovalStatus;
import com.stanzaliving.core.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KycActualDocumentDto {

    private Long id;

    private String uuid;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

    private boolean status = true;

    private DocumentTypeEnum documentType;

    private String bookingUuid;

    private String residentUuid;

    private String residentCode;

    private String uploadedBy;

    private LocalDate uploadedDate;

    private boolean isVerified = false;

    private String verifiedBy;

    private Date verificationDate;

    private boolean needsManualVerification = false;

    private ApprovalStatus approvalStatus;

    private String approvedBy;

    private LocalDate approvalDate;

    private String rejectedBy;

    private LocalDate rejectionDate;

    private String rejectionReason;

    private Integer reUploadCount = 0;

    private String metadata;

    private boolean isActive = true;

}
