package com.stanzaliving.core.far.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.far.enums.QrCodeStatus;
import com.stanzaliving.core.far.enums.TransferScanStatus;
import com.stanzaliving.core.grsi.dto.response.ToResponseDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransferScanResponseDto {
    private QrCodeStatus qrCodeStatus;
    private String name;
    private String description;
    private List<String> assetImagesPath;
    private TransferScanStatus transferScanStatus;
    private String cartUuid;
    private Date discardedOn;
    private String discardedBy;
    private String returnedBy; // asset Returned by
    private Date returnedOn; // asset Returned On
    private List<ToResponseDto> transferOrderList;
    private String assetId;
    private String assetUuid;
    private String qrCodeId;
    private String qrCode;
    private String locationName;
    private String vendorName;
    private TransferScanStatus message;
    private String sourceLocationName;
    private String errorMsg;
    private String errorHeading;
}
