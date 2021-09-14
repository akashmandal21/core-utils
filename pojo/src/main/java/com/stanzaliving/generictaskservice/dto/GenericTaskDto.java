package com.stanzaliving.generictaskservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.taskservice.enums.TaskType;
import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

    private Map<String, Object> var2;

    private String variable2;

    private String var3;

    private String var4;

    @NotBlank(message = "Task Status cannot be empty")
    private String taskStatusUuid;

    private String taskSubStatusUuid;

    private boolean autoTaskCompletion;

    private String autoTaskCompletionEventUuid;

    private String parentTaskUuid;

    private List<GenericTaskDto> subTasks;

    @NotBlank(message = "Task category Id cannot be empty")
    private String taskCategoryUuid;

    @NotBlank(message = "Task Sub Category Id cannot be empty")
    private String taskSubCategoryUuid;

    private List<String> attachmentsList;

    private List<String> dependentTaskUuidList;

    private List<String> tagsUuidList;

    private List<String> commentsUuidList;

    private Department department;

}
