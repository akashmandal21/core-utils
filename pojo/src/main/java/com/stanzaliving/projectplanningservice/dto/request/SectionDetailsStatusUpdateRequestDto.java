package com.stanzaliving.projectplanningservice.dto.request;

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
public class SectionDetailsStatusUpdateRequestDto {

    protected Long id;

    @NotBlank(message = "Uuid is required")
    protected String uuid;

    @NotBlank(message = "task service uuid is required")
    private String taskServiceUuid;

    private TaskOwnerTypeEnum taskOwnerType;

    private int duration;

    private Duration durationUnit;

    private String moduleUuid;

    private PlanningStatus sectionStatus;

    private String activityUuid;

    private List<String> predecessorTasks;

    private Date startDate;

    private Date dueDate;

    private String taskOwner;

    private String taskName;

    private String description;

    private TaskType type;

    private boolean autoTaskCompletion;

    private String parentTemplateUuid;

    private String parentTaskUuid;

    private String taskStatusUuid;

    private Department department;

    private List<SectionDetailsStatusUpdateRequestDto> tasks;

    private List<String> attachmentsList;

    private List<String> dependentTaskUuidList;

    private Date plannedStartDate;

    private Date plannedDueDate;

    private Date actualStartDate;

    private Date actualDueDate;

    private boolean hiddenFlag;
}
