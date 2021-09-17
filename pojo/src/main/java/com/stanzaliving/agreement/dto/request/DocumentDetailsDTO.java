package com.stanzaliving.agreement.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDetailsDTO {
    private String referenceID;
    private String documentFormat;
    private String folderID;
    private String fileNameInternal;
    private String expiredBy;
    private String expiryDate;
    private String documentStatus;
    private String documentType;
    private String documentID;
    private String parentDocumentDetailsUUID;
}
