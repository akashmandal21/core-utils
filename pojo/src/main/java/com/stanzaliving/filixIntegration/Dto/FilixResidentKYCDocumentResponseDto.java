package com.stanzaliving.filixIntegration.Dto;

import com.stanzaliving.filixIntegration.Enum.DocumentSideType;
import com.stanzaliving.filixIntegration.Enum.DocumentUploadType;
import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FilixResidentKYCDocumentResponseDto {
    private List<KYCListingResponseDto> fileResponseDtos;

    private List<DocumentUploadType> validDocuments;

    private DocumentUploadType[] documentTypes;

    private List<DocumentUploadType> dualSideDocuments;

    private DocumentSideType[] documentSideTypes;

    private List<RejectionReasonDto> rejectionReason;
}
