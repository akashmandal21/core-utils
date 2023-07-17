package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.ApprovalStatus;
import com.stanzaliving.core.enums.DocumentSide;
import com.stanzaliving.core.enums.DocumentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KycDocumentDTO {
    private String documentUuid;

    private DocumentTypeEnum documentType;

    private DocumentSide documentSide;

    private String fileUrl;

    private String metadata;

    private String residentUuid;

    private String residentCode;

    private String bookingUuid;

    private boolean isVerified;

    private ApprovalStatus approvalStatus;

    private String rejectionReason;

    private boolean maxUploadRetriesReached;

    private String message;

    private boolean isActive;

}
