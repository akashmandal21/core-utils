package com.stanzaliving.core.far.dto;

import com.stanzaliving.core.far.enums.AssetAllocatedTo;
import com.stanzaliving.core.far.enums.AssetLocatedIn;
import com.stanzaliving.core.far.enums.OtherArea;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AllocationDto {
    private String assetUuid;
    private String addressUuid; // todo - Call transformation_master with addressUuid - It will return microMarketUuid & cityUuid
    private String microMarketUuid;
    private String cityUuid;
    private String locationType;
    private String locationName;
    private AssetAllocatedTo allocatedTo;
    private String buildingName;
    private AssetLocatedIn allocatedIn;
    private OtherArea otherAreaName;
    private Integer roomNumber;
    private Integer floorNumber;
    private String employeeId;
    private String employeeDepartment;
    private String employeeName;
    private String employeeEmail;
}