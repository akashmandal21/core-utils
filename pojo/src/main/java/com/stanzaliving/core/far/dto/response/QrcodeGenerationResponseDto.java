package com.stanzaliving.core.far.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QrcodeGenerationResponseDto {
    private Long countOfQRGenerated;
    private String docLink;
    private String recipientEmail;
}