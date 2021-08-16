package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
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

    private TaskType type;

    @NotBlank(message = "Priority cannot be empty")
    private String priority;

    private boolean overridable;

    @NotBlank(message = "Task Name cannot be empty")
    private String taskName;

    @NotBlank(message = "Description cannot be empty")
    private String description;

    private String entityUUId;

    private String entityType;

    private String var1;

    private String var2;

    private String var3;

    private String var4;

    @NotBlank(message = "Task Status cannot be empty")
    private String taskStatusUUId;

    private String taskSubStatusUUId;

    private boolean autoTaskCompletion;

    private String autoTaskCompletionEventUUId;

    private String parentTaskUUId;

    private List<GenericTaskDto> subTasks;

    @NotBlank(message = "Task category Id cannot be empty")
    private String taskCategoryUUId;

    @NotBlank(message = "Task Sub Category Id Name cannot be empty")
    private String taskSubCategoryUUId;

    private List<String> attachmentsList;

    private List<String> dependentTaskUUIdList;

    private List<String> tagsUUIdList;


}
