package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.Department;
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

    @NotBlank(message = "Owner Type is required")
    private TaskOwnerTypeEnum taskOwnerType;

    private int duration;

    private Duration durationUnit;

    private String moduleUuid;

    private String moduleName;

    /*
     Child sections uuids [ Template/Property plan Level ]
     */
    private List<String> taskServiceUuIds;

    private String activityUuid;

    private String activityName;

    /*
     Dependent tasks [ Mandatory/Pre-requisite tasks ]
     */
    private List<String> predecessorTasks;

    /*
     Upcoming tasks
     */
    private List<String> successorTasks;

    protected Date createdAt;

    protected Date updatedAt;

    private String taskServiceUuid;

    private String parentTemplateUuid;

    private boolean taskTemplate;

    private Date startDate;

    private Date dueDate;

    @NotEmpty(message = "Task owner cannot be null")
    private String taskOwner;

    /*
    module = pp,gts,hk
     */
    private String module;

    @NotBlank(message = "Task Name cannot be empty")
    private String taskName;

    private String description;

    @NotBlank(message = "Type is required")
    private TaskType type;

    private boolean autoTaskCompletion;

    private String parentTaskUuid;

    /*
     Status of the task
     */
    private String taskStatusUuid;

    @NotBlank(message = "Department is required")
    private Department department;

    @Valid
    private List<SectionDetailsDto> tasks;

    private List<String> attachmentsList;

    private List<String> dependentTaskUuidList;

    private Date plannedStartDate;

    private Date plannedDueDate;

    private Date actualStartDate;

    private Date actualDueDate;

    private Integer completionStatus;

    private String color;

    private Long percentage;

    /*
      @NotBlank(message = "Order Sequence is required")
     */
    private Integer orderSequence;
}
