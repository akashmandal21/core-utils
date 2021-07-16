package com.stanzaliving.wanda.response;

import com.stanzaliving.wanda.enums.DocumentSideType;
import com.stanzaliving.wanda.enums.DocumentUploadType;
import com.stanzaliving.wanda.enums.ResidentDocumentContext;
import lombok.*;

import java.util.List;

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

    private String icon;

    private String statusBackground;

    private String documentName;

    private String category;
}
