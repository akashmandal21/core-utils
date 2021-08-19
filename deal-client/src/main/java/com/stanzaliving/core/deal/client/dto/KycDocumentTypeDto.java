package com.stanzaliving.core.deal.client.dto;

import com.stanzaliving.core.deal.client.enums.B2bDocumentType;
import com.stanzaliving.core.deal.client.enums.KycDocumentUploadStatus;
import com.stanzaliving.core.user.enums.EnumListing;
import lombok.*;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KycDocumentTypeDto {

    private EnumListing<B2bDocumentType> document;

    @Builder.Default
    private EnumListing<KycDocumentUploadStatus> status =
            EnumListing.of(KycDocumentUploadStatus.PENDING, KycDocumentUploadStatus.PENDING.getName());
}
