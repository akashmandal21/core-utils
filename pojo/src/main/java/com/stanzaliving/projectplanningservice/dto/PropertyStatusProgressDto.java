package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

/**
 * @author Pradeep Naik R
 * @description DTO for Project Plan Template
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PropertyStatusProgressDto extends AbstractDto {

    private Integer overAllPlanDelayedBy;

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
