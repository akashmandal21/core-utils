package com.stanzaliving.core.far.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransferOutCartDto {
    private String itemCode;
    private String itemName;
    private Integer countOfAssets;
    private List<TransferOutCartAssetDto> assetDetails;
}
