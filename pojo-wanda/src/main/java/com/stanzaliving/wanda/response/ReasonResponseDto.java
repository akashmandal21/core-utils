package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReasonResponseDto {

    private String reasonUuid;
    private String reason;
    private String reasonType;
    private boolean isProofMandatory;
}
