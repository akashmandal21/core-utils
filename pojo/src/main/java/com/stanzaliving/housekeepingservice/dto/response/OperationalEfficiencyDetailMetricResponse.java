package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Vikas S T
 * @date 19-Jan-22
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OperationalEfficiencyDetailMetricResponse {
    private String residenceName;
    private String residenceUuid;
    private List<OperationalEfficiencyHKStaffCountTimeUtilResponseDto> hkStaffCountTimeUtils;
    private List<OperationalEfficiencyHKStaffWiseUtilizResponseDto> hkStaffWiseUtilizations;
}
