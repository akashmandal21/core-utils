package com.stanzaliving.core.far.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.far.enums.AssetAllocatedTo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AllocationResponseDto {
    private String addressUuid; // Call transformation_master with addressUuid - It will return microMarketUuid & cityUuid
    private String microMarketUuid;
    private String cityUuid;
    private String locationType;
    private String locationName;
    private String allocatedTo;
    private AssetAllocatedTo allocatedToEnum;
    private String allocatedIn;
    private String otherAreaName;
    private String roomNumber;
    private String floorNumber;
    private String employeeId;
    private String employeeDepartment;
    private String employeeName;
    private String employeeEmail;
}