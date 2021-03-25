package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.enums.QrCodeStatus;
import com.stanzaliving.core.far.enums.TransferScanStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransferScanResponseDto {
    QrCodeStatus qrCodeStatus;
    String name;
    String description;
    TransferScanStatus transferScanStatus;
    String cartAssetUuid;
    Date discardedOn;
    String discardedBy;
}
