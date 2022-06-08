package com.stanzaliving.agreement.dto.response;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CallbackResponseDto {
    private RequestDto request;
    private String irn;
    private List<String> files;
    private String documentId;
    private String mac;
    private String auditTrail;
    private VerificationDto verification;
    private SignerDto signer;
}
