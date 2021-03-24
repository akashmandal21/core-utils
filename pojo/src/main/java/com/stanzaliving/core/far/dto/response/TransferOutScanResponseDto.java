package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.enums.QrCodeStatus;
import com.stanzaliving.core.far.enums.TransferOutScanStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransferOutScanResponseDto {
    String name;
    String description;
    TransferOutScanStatus transferOutScanStatus;
    String cartAssetUuid;
}
