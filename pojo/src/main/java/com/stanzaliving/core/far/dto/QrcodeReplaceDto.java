package com.stanzaliving.core.far.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QrcodeReplaceDto {
    private String oldQrcodeId;
    private String oldQrcode;
    private String newQrcode;
    private String assetId;
}
