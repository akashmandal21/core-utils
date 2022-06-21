package com.stanzaliving.agreement.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RequestDTO {

    private String payload;

    private String signUrl;

    private String requestStatus;

    private Long attemptNumber;

    private Long version;

    private String responseData;

    private Boolean isDocGenerationRequired;

    private String documentType;

    private String documentSubType;

    private String documentStatus;

    private String documentID;

    private String parentDocumentID;

    private String templateUUID;
    
    private String referenceUuid;
}
