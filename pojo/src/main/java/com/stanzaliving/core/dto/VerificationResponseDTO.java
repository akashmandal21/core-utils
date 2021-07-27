package com.stanzaliving.core.dto;

import com.stanzaliving.core.dto.DocumentFieldVerificationDTO;
import com.stanzaliving.core.enums.VerificationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VerificationResponseDTO {
    private List<DocumentFieldVerificationDTO> verifications;

    private VerificationStatus verificationStatus;

    private String message;
}
