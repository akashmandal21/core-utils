package com.stanzaliving.wanda.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReasonResponseDto {

    private String reasonUuid;
    private String reason;
    private String reasonType;
    private boolean isProofMandatory;

    public boolean getIsProofMandatory(){
        return this.isProofMandatory;
    }
}
