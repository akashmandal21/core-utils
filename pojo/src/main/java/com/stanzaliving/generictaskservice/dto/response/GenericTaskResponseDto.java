package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.generictaskservice.dto.*;
import com.stanzaliving.taskservice.enums.TaskType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

/**
 * @author Priyadarshini MB
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GenericTaskResponseDto {

    private boolean taskTemplate;
    private String taskUuid;
    private Date startDate;
    private Date dueDate;
    private String taskName;
    private TaskType type;
    private boolean overridable;
    private boolean status;
    private String module;
    private String priority;
    private String priorityUuid;
    private String description;
    private String entityType;
    private AdditionalVarsDto var1;
    private AdditionalVarsDto var2;
    private AdditionalVarsDto var3;
    private AdditionalVarsDto var4;
    private TaskCategoryDto taskCategoryDto;
    private TaskCategoryDto taskSubCategoryDto;
    private StatusDto taskStatusDto;
    private StatusDto taskSubStatusDto;
    private boolean autoTaskCompletion;
    private Department department;
    private List<String> commentsUUIdList ;
    private List<GenericTaskAttachmentDto> attachmentsList;
    private List<String> dependentTaskUUIdList;
    private List<TagsGenericResponseDto> tags;
    private List<GenericTaskDto> subTasks;

    private String entityUUId;
    private String taskOwnerUuid;
    private String taskOwnerFirstName;
    private String taskOwnerLastName;

    private String createdByUuid;
    private String createdByFirstName;
    private String createdByLastName;
    private String createdByUserType;

    private String updatedByUuid;
    private String updatedByFirstName;
    private String updatedByLastName;
    private String updatedByUserType;
    private String autoTaskCompletionEventUUId;

    protected Date createdAt;
    protected Date updatedAt;

    private String parentTaskUuid;
}
