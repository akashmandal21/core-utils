package com.stanzaliving.wanda.response;

import java.util.List;

import com.stanzaliving.wanda.enums.DocumentSideType;
import com.stanzaliving.wanda.enums.DocumentUploadType;
import com.stanzaliving.wanda.enums.ResidentDocumentContext;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
