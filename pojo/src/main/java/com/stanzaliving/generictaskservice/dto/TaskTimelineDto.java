package com.stanzaliving.generictaskservice.dto;

import lombok.*;

import java.time.LocalDate;
import java.util.Map;

/**
 * @author anudeep.alevoor
 *
 *
 * Task History Timeline Dto class for Task Service History.
 *
 */

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskTimelineDto {

    private String taskName;

    private String taskId;

    private String taskOwnerUuid;

    private String taskOwnerFirstName;

    private String taskOwnerLastName;

    private String updatedByUuid;

    private String updatedByFirstName;

    private String updatedByLastName;

    private String updatedByUserType;

    private LocalDate updatedAt;

    private String taskStatusUuid;

    private String taskStatusName;

    private String taskSubStatusUuid;

    private String taskSubStatusName;

    private String subTaskStatusUuid;

    private String subTaskStatusName;

    private String subTaskSubStatusUuid;

    private String subTaskSubStatusName;

    private String comment;

    private Map<String, Object> metaDataChanges;

    private String summary;
}
