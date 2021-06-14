package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.dto.QrPdfEntryDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QrcodeGenerationResponseDto {
    private Long countOfQRGenerated;
    private List<QrPdfEntryDto> qrCodes;
    private String docLink;
    private String recipientEmail;
}