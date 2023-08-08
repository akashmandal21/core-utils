package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.taskservice.enums.TaskType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GenericTaskDto extends AbstractDto {

    private boolean taskTemplate;

    @NotBlank(message = "Module cannot be empty")
    private String module;

    private Date startDate;

    private Date dueDate;

    private String taskOwner;

    private String taskOwnerName;

    private TaskType type;

    private String priority;

    private boolean overridable;

    @NotBlank(message = "Task Name cannot be empty")
    private String taskName;

    private String description;

    private String entityUUId;

    private String entityType;

    private String var1;

    private String var2;

    private String var3;

    private String var4;

    private String taskStatusUuid;

    private String taskStatusName;

    private String taskSubStatusUuid;

    private boolean autoTaskCompletion;

    private String autoTaskCompletionEventUuid;

    private String parentTaskUuid;

    private List<GenericTaskDto> subTasks;

    private String taskCategoryUuid;

    private String taskSubCategoryUuid;

    private List<String> attachmentsList;

    private List<String> dependentTaskUuidList;

    private List<String> tagsUuidList;

    private List<String> commentsUuidList;

    private Department department;

    private DelayDto delayDto;

}
