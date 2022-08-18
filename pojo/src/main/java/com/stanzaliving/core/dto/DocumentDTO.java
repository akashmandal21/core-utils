package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.ApprovalStatus;
import com.stanzaliving.core.enums.DocumentCategory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDTO {
    private Long id;

    private String uuid;

    private DocumentTypeDTO documentType;

    private String bookingUuid;

    private String residentUuid;

    public String residentCode;

    private String uploadedBy;

    private LocalDate uploadedDate;

    private boolean isVerified;

    private String verifiedBy;

    private LocalDate verificationDate;

    private boolean needsManualVerification;

    private ApprovalStatus approvalStatus;

    private String approvedBy;

    private LocalDate approvalDate;

    private String rejectedBy;

    private LocalDate rejectionDate;

    private String rejectionReason;

    private Integer reUploadCount;

    private Set<DocumentAssetDTO> assets;

    private String metadata;

    private boolean maxUploadRetriesReached;

    private String message;

    private boolean isActive;

    private boolean allowRejection;

    private LocalDate updatedAt;

    private DocumentCategory documentCategory;
}