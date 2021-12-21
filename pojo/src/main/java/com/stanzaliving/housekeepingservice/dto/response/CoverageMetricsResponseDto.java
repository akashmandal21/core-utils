package com.stanzaliving.housekeepingservice.dto.response;

import lombok.*;

/**
 * @author Priyadarshini MB
 */

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class CoverageMetricsResponseDto {

    private long  plannedDailyCount;
    private long  plannedThriceCount;
    private long  plannedTwiceCount;
    private long  plannedOnceCount;

    private long  promisedDailyCount;
    private long  promisedThriceCount;
    private long  promisedTwiceCount;
    private long  promisedOnceCount;

    private String taskTypeName;
    private long  totalNumberOfRooms;

}
