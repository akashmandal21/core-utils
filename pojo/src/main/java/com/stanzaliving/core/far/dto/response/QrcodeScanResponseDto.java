package com.stanzaliving.core.far.dto.response;

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
    private String assetId;
    private String assetName;
    private String locationName;
    private String qrCode;
    private String qrCodeId;
    private Date addedOn;
    private String addedBy;
    private Date lastUpdatedOn;
    private String lastUpdatedBy;
    private Date discardedOn;
    private String discardedBy;
    private Date returnedOn;
    private String returnedBy;
    private String errorMsg;
    private String errorHeading;
    private String successMsg;
    private String successHeading;
    
}
