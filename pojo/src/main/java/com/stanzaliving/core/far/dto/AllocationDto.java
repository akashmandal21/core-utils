package com.stanzaliving.core.far.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.core.far.enums.AssetAllocatedTo;
import com.stanzaliving.core.far.enums.AssetLocatedIn;
import com.stanzaliving.core.far.enums.OtherArea;
import com.stanzaliving.transformations.enums.LocationType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllocationDto {
    private String addressUuid;
    private String microMarketUuid;
    private String cityUuid;
    private LocationType locationType;
    private String locationName;
    private AssetAllocatedTo allocatedTo;
    private AssetLocatedIn allocatedIn;
    private OtherArea otherAreaName;
    private String roomNumber;
    private String floorNumber;
    private String employeeId;
    private Department employeeDepartment;
    private String employeeName;
    private String employeeEmail;
}