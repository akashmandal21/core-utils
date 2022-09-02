package com.stanzaliving.agreement.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgreementVentaMappingDto {
    private String referenceID;
    private String agreementUrl;
}
