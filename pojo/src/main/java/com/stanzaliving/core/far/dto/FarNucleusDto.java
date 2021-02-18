package com.stanzaliving.core.far.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    private String subCategory;

    //private String assetLocation;
    private String locationName;
    private String buildingName;
    private String allocatedIn;
    private String otherAreaName;
    private Integer roomNumber;
    private Integer floorNumber;

    private String addedBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private Timestamp addedOn;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private Timestamp lastAuditedOn;

    private String lastAuditedBy;
    private String assetStatus;
    private Integer taskDueCount;
}