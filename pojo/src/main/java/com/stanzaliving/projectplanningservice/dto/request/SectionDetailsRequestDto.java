package com.stanzaliving.projectplanningservice.dto.request;

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
public class SectionDetailsRequestDto {

    @NotNull(message = "Task Owner Type cannot be null")
    private TaskOwnerTypeEnum taskOwnerType;

    private int duration;

    private Duration durationUnit;

    @Size(max = 40, message = "Max allowed characters up to 40")
    private String moduleUuid;

    @Size(max = 40, message = "Max allowed characters up to 40")
    private String activityUuid;

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

    private boolean taskTemplate;

    private Date startDate;

    private Date dueDate;

    @Size(max = 40, message = "Max allowed characters up to 40")
    @NotEmpty(message = "Task owner cannot be null")
    private String taskOwner;

    /*
    module = pp,gts,hk
     */
    @Size(max = 6, message = "Max allowed characters up to 6")
    private String module;

    @Size(max = 80, message = "Max allowed characters up to 80")
    @NotBlank(message = "Task Name cannot be empty")
    private String taskName;

    @Size(max = 80, message = "Max allowed characters up to 80")
    private String description;

    @NotNull(message = "type cannot be null")
    private TaskType type;

    private boolean autoTaskCompletion;

    /*
     Status of the task
     */
    private String taskStatusUuid;

    @NotNull(message = "department cannot be null")
    private Department department;

    @Valid
    private List<SectionDetailsRequestDto> tasks;

    private List<String> attachmentsList;

    private List<String> dependentTaskUuidList;

    /*
      @NotBlank(message = "Order Sequence is required")
     */
    private Integer orderSequence;
}
