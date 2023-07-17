package com.stanzaliving.projectplanningservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Pradeep Naik R
 * @description DTO for Project Plan Template
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PropertyStatusProgressDto {

    private Integer overAllPlanDelayedByPercentage;

    private Integer overAllPlanOnTrackByPercentage;

    private Long taskDelayedByDays;

    private Integer taskCompletedPercentage;

    private Integer numberOfTasksCompleted;

    private Integer taskInProgressPercentage;

    private Integer numberOfTasksInProgress;

    private Integer taskDelayedPercentage;

    private Integer numberOfTasksDelayed;

    private Integer taskNotStartedPercentage;

    private Integer numberOfTasksNotStarted;
}
