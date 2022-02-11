package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

/**
 * @author Priyadarshini MB
 */

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class OperationalEfficiencyMetricsResponse {

    double averageWorkingHoursPerDay;
    float averageDailyTimeUtilizationPercentage;
    double underWrittenEmployeeCount;
    double averageUnderWrittenEmployeeUtilizationPercentage;
}
