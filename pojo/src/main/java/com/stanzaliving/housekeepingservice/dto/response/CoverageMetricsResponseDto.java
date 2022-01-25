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

    private int plannedDailyCount;
    private int plannedThriceCount;
    private int plannedTwiceCount;
    private int plannedOnceCount;

    private int promisedDailyCount;
    private int promisedThriceCount;
    private int promisedTwiceCount;
    private int promisedOnceCount;

    private String taskTypeName;
    private int totalNumberOfRooms;


}
