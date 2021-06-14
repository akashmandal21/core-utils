package com.stanzaliving.core.far.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FarNucleusDto {

    private String assetUuid;
    private String assetId;
    private String assetName;
    private String assetType;
    private String assetOwner;
    private String subCategory;
    private String subCategoryLabel;

    //private String assetLocation;
    private String locationName;
    private String allocatedIn;
    private String otherAreaName;
    private String roomNumber;
    private String floorNumber;
    private String addedBy;
    private Timestamp addedOn;
    private Timestamp lastAuditedOn;
    private String lastAuditedBy;
    private String assetStatus;
    private String statusText;
    private Integer taskDueCount;
    private String textColor;
    private String bgColor;
}