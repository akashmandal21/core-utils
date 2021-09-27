package com.stanzaliving.agreement.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AgreementDto {
    private String referenceID;

    private String agreementDocumentId;

    private String addendumDocumentId;

    private String agreementUrl;

    private String addendumUrl;
}
