package com.stanzaliving.core.far.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransferCartAssetDto {
    private String qrUrl;
    private String qrCodeId;
    private String assetId;
    private String assetUuid;
}