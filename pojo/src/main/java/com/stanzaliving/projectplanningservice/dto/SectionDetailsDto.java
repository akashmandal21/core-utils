package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.projectplanningservice.enums.Duration;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import com.stanzaliving.projectplanningservice.enums.TaskOwnerTypeEnum;
import com.stanzaliving.taskservice.enums.TaskType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
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

    private TaskOwnerTypeEnum taskOwnerType;

    private String parentUuid;

    private int duration;

    private Duration durationUnit;

    private String moduleUuid;

    private String moduleName;

    private List<String> taskServiceUuIds;

    private PlanningStatus sectionStatus;

    private String activityUuid;

    private String activityName;

    private List<String> predecessorTasks;

    protected Date createdAt;

    protected Date updatedAt;

    private String taskServiceUuid;

    private String parentTemplateUuid;

    private boolean taskTemplate;

    private Date startDate;

    private Date dueDate;

    private String taskOwner;

    /*
    module = pp,gts,hk
     */
    private String module;

    @NotBlank(message = "Task Name cannot be empty")
    private String taskName;

    @NotBlank(message = "Description cannot be empty")
    private String description;

    private TaskType type;

    private boolean autoTaskCompletion;

    private String parentTaskUuid;

    private String taskStatusUuid;

    private Department department;

    private List<SectionDetailsDto> tasks;

    private List<String> attachmentsList;

    private List<String> dependentTaskUuidList;

    private Date plannedStartDate;

    private Date plannedDueDate;

    private Date actualStartDate;

    private Date actualDueDate;

    private long completionStatus;

    private String color;
}
