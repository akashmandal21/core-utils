package com.stanzaliving.core.far.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QrcodeHistoryResponseDto {

    private String historyUuid;
    private String uName;
    private String department;
    private Long countOfQRGenerated;
    private Date generatedOn;
    private String docLink;
    private String qrcodePdfGenerationStatus;
    private String textColor;
    private String bgColor;
}
