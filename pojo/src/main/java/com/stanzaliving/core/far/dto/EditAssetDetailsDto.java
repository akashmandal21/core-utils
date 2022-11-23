package com.stanzaliving.core.far.dto;

import com.stanzaliving.core.far.enums.AssetType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditAssetDetailsDto {
    private String itemCode;
    private String assetName;
    private String assetDescription;
    private String owner;
    private AssetType assetType;
}
