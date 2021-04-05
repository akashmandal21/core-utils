package com.stanzaliving.core.far.dto.response;

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
public class TransferScanResponseDto {
    QrCodeStatus qrCodeStatus;
    String name;
    String description;
    String itemImage;
    TransferScanStatus transferScanStatus;
    String cartAssetUuid;
    Date discardedOn;
    String discardedBy;
    List<ToResponseDto> transferOrderList;
    String assetId;
    String assetUuid;
}
