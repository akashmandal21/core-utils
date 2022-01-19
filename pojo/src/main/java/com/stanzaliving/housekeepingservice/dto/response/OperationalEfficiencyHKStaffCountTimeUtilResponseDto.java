package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

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
public class OperationalEfficiencyHKStaffCountTimeUtilResponseDto {
    double averageDailyTimeUtilizationPercentage;
    private String residenceName;
    private String residenceUuid;
    private int hkCountUnderWritten;
    private int hkCountBeatPlan;
}
