package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.enums.TransferScanStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransferScanResponseDto {
    String name;
    String description;
    TransferScanStatus transferScanStatus;
    String cartAssetUuid;
}
