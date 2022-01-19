package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 17-Jan-22
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OperationalEfficiencyOverallMetricResponse {
    private List<OperationalEfficiencyHKStaffCountTimeUtilResponseDto> hkStaffCountTimeUtils;
    private List<OperationalEfficiencyHKStaffWiseUtilizResponseDto> hkStaffWiseUtilizations;
}
