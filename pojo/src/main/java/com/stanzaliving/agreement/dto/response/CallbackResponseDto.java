package com.stanzaliving.agreement.dto.response;

import lombok.*;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CallbackResponseDto {
    private RequestDto request;
    private String irn;
    private String files;
    private String documentId;
    private String mac;
    private VerificationDto verification;
    private SignerDto signer;
}
