package com.stanzaliving.wanda.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
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

    @JsonProperty("isProofMandatory")
    public boolean getIsProofMandatory(){
        return this.isProofMandatory;
    }
}
