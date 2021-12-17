package com.stanzaliving.filixIntegration.Dto;

import com.stanzaliving.filixIntegration.Enum.DocumentSideType;
import com.stanzaliving.filixIntegration.Enum.DocumentUploadType;
import com.stanzaliving.filixIntegration.Enum.ResidentDocumentContext;
import lombok.*;

import java.util.List;
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KYCListingResponseDto {
    private ResidentDocumentContext residentDocumentContext;

    private DocumentUploadType documentUploadType;

    private DocumentSideType documentSideType;

    private List<KYCDocumentDto> kycDocumentList;

    private String metadata;

    private String userId;

    private String bookingUuid;

    private boolean isVerified;

    private String approvalStatus;

    private String rejectedReason;

    private String kycDocumentUuid;

    private String documentLabel;

    private String documentIcon;

    private String statusBackground;

    private String documentName;

    private String category;

    private String categoryIcon;

    private Integer order;

    private String fileUrl;

    private String bucketName;

    private String documentUuid;

    private String filePath;

    private String fileName;
}
