package com.stanzaliving.agreement.dto.response;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ServiceResponse {
    private String referenceUuid;
    private String agreementStatus;
    private String message;
}
