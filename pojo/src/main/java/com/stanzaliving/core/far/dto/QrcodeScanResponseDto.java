package com.stanzaliving.core.far.dto;

import com.stanzaliving.core.far.enums.QrCodeStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QrcodeScanResponseDto {

    private QrCodeStatus qrCodeStatus;
    private String assetCode;
    private String assetName;
    private String locationName;
    private String qrCode;
    private Date addedOn;
    private String addedBy;
    private Date discardedOn;
    private String discardedBy;
}
