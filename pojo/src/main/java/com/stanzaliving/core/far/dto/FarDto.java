package com.stanzaliving.core.far.dto;

import com.stanzaliving.core.far.enums.AssetStatus;
import com.stanzaliving.core.far.enums.AssetType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FarDto {
    private String assetUuid;
    private String assetId;
    private String assetName;
    private AssetType assetType;
    //private String subCategory;
    //private String assetLocation;
    private String addedBy;
    private Date addedOn;
    private Date lastAuditedOn;
    private String lastAuditedBy;
    private AssetStatus assetStatus;
    private Integer taskDueCount;
    //private String textColor;
    //private String bgColor;
}