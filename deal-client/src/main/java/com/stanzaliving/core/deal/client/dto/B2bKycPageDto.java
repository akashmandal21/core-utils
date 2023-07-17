package com.stanzaliving.core.deal.client.dto;

import com.stanzaliving.core.deal.client.enums.DocumentUploadType;
import com.stanzaliving.core.deal.client.enums.PurposeOfArrival;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class B2bKycPageDto {

    private List<KycDocumentTypeDto> documentTypes;

    private List<EnumListing<DocumentUploadType>> documentUploadTypes;

    private List<DocumentUploadType> dualSideDocuments;

    private List<EnumListing<PurposeOfArrival>> purposeOfArrival;

    @Builder.Default
    private boolean isDropDownEnabled = true;
}