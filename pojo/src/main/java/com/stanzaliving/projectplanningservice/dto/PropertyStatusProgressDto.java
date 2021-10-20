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

    private Integer overAllPlanDelayedBy;

    private Integer overAllPlanOnTrackBy;

    private Integer taskDelayedBy;

    private Integer totalTaskDelayedBy;

    private Integer taskCompleted;

    private Integer totalTaskCompleted;

    private Integer taskInProgress;

    private Integer totalTaskInProgress;

    private Integer taskDelayed;

    private Integer totalTaskDelayed;

    private Integer taskNotStarted;

    private Integer totalTaskNotStarted;
}
