package com.stanzaliving.core.dto;

import com.stanzaliving.core.enums.VerificationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentFieldVerificationDTO {
    private String fieldName;

    private String submittedValue;

    private String verifiedValue;

    private VerificationStatus status;

    public DocumentFieldVerificationDTO(String fieldName, String verifiedValue) {
        this.fieldName = fieldName;
        this.verifiedValue = verifiedValue;
    }
}
