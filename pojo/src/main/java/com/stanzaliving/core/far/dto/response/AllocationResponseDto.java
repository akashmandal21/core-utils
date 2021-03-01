package com.stanzaliving.core.far.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
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
    private String addressUuid; // todo - Call transformation_master with addressUuid - It will return microMarketUuid & cityUuid
    private String microMarketUuid;
    private String cityUuid;
    private String locationType;
    private String locationName;
    private String allocatedTo;
    private String allocatedIn;
    private String otherAreaName;
    private Integer roomNumber;
    private Integer floorNumber;
    private String employeeId;
    private String employeeDepartment;
    private String employeeName;
    private String employeeEmail;
}