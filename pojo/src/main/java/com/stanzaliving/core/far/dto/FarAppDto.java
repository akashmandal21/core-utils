package com.stanzaliving.core.far.dto;

import com.stanzaliving.core.far.enums.AssetLocatedIn;
import com.stanzaliving.core.far.enums.AssetStatus;
import com.stanzaliving.core.far.enums.OtherArea;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FarAppDto {
    private String assetUuid;
    private String assetId;
    private String assetName;
    private AssetStatus assetStatus;

    private String locationName;
    private String buildingName;
    private AssetLocatedIn allocatedIn;
    private OtherArea otherAreaName;
    private Integer roomNumber;
    private Integer floorNumber;
}