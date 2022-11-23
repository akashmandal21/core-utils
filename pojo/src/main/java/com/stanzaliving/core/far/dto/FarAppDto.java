package com.stanzaliving.core.far.dto;

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
    private String assetStatus;

    private String locationName;
    private String allocatedIn;
    private String allocatedTo;
    private String otherAreaName;
    private String roomNumber;
    private String floorNumber;
    private String employeeId;
    private String employeeName;
    private String employeeDepartment;
    private String employeeEmail;

}