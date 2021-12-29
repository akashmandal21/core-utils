package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

/**
 * @author Vikas S T
 * @date 07-Nov-21
 **/

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class HkBeatPlanOperationResponseDto {
    private String averageWorkingHoursPerDay;
    private String averageDailyTimeUtilizationPercentage;
    private String underwritten;
    private String housekeepingUtilizationsPercentage;
}
