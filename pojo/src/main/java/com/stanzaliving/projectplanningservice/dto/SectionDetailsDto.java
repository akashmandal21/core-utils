package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.generictaskservice.dto.DelayDto;
import com.stanzaliving.projectplanningservice.enums.Duration;
import com.stanzaliving.projectplanningservice.enums.TaskOwnerTypeEnum;
import com.stanzaliving.taskservice.enums.TaskType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * @author Pradeep Naik R
 * @description DTO for Section Details
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class SectionDetailsDto extends AbstractDto {

    @NotNull(message = "Task Owner Type cannot be null")
    private TaskOwnerTypeEnum taskOwnerType;

    private Integer duration;

    private Duration durationUnit;

    @Size(max = 40, message = "Max allowed characters up to 40")
    private String moduleUuid;

    private String moduleName;

    /*
     Child sections uuids [ Template/Property plan Level ]
     */
    private List<String> taskServiceUuIds;

    @Size(max = 40, message = "Max allowed characters up to 40")
    private String activityUuid;

    private String activityName;

    /*
     Dependent tasks [ Mandatory/Pre-requisite tasks ]
     */
    private List<String> predecessorTasks;

    /*
    Response Sent to FE with Name and Uuid
     */
    private List<PredecessorTaskDto> predecessorTasksDtoResponseList;

    /*
     Upcoming tasks
     */
    private List<SuccessorTaskDto> successorTasksDtoResponseList;

    protected Date createdAt;

    protected Date updatedAt;

    private String createdByName;

    private String updatedByName;

    private String taskServiceUuid;

    private String parentTemplateUuid;

    private String parentUuid;

    private boolean taskTemplate;

    /*
     date validation handled in validation function
     Since Dto used by plan and template, adding validation will effect @dto level
     */
    private Date startDate;

    private Date dueDate;

    @Size(max = 40, message = "Max allowed characters up to 40")
    @NotEmpty(message = "Task owner cannot be null")
    private String taskOwner;

    private String taskOwnerName;

    /*
    module = pp,gts,hk
     */
    @Size(max = 6, message = "Max allowed characters up to 6")
    private String module;

    @Size(min = 3, max = 200, message = "Max allowed characters between 3 and 80")
    @NotBlank(message = "Task Name cannot be empty")
    private String taskName;

    @Size(max = 80, message = "Max allowed characters up to 80")
    private String description;

    @NotNull(message = "type cannot be null")
    private TaskType type;

    private boolean autoTaskCompletion;

    private String parentTaskUuid;

    /*
     Status of the task
     */
    private String taskStatusUuid;

    private String taskStatusName;

    @NotNull(message = "department cannot be null")
    private Department department;

    private List<String> attachmentsList;

    private List<String> dependentTaskUuidList;

    private Date plannedStartDate;

    private Date plannedDueDate;

    private Date actualStartDate;

    private Date actualDueDate;

    private Integer completionStatus;

    private String color;

    private Long percentage;

    private Integer orderSequence;

    private Integer taskTypeSequence;

    private DelayDto delayDto;

    private String predecessorSuccessorRemapUuid;

    private boolean hiddenFlag;

    private List<String> commentsUuidList;

    private Integer taskDelayedBy;

    @Valid
    private List<SectionDetailsDto> tasks;

    private Boolean isDelayed;

    private String liveParentTaskId;

    private Boolean isMilestone;

}
