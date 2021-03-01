package com.stanzaliving.core.far.dto.response;

import com.stanzaliving.core.far.dto.AssetSummaryDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FarNucleusCombinedResponseDto {

    private AssetSummaryDto infoDto;
    private String assetUuid;
    private String assetId;
    private String assetName;
    private String assetType;
    private String subCategory;

    //private String assetLocation;
    private String locationName;
    private String buildingName;
    private String allocatedIn;
    private String otherAreaName;
    private Integer roomNumber;
    private Integer floorNumber;
    private String addedBy;
    private Timestamp addedOn;
    private Timestamp lastAuditedOn;
    private String lastAuditedBy;
    private String assetStatus;
    private String statusText;
    private Integer taskDueCount;
}