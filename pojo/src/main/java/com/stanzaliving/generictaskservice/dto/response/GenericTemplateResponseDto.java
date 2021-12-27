package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.generictaskservice.dto.*;
import com.stanzaliving.taskservice.enums.TaskType;
import lombok.*;
import lombok.experimental.SuperBuilder;

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
public class GenericTemplateResponseDto {

    private boolean taskTemplate;

    private String templateUuid;

    private String templateName;

    private boolean overridable;

    private String module;

    private String description;

    private String entityType;

    private TaskCategoryDto taskCategory;

    private TaskCategoryDto taskSubCategory;

    private Department department;

    private boolean autoTaskCompletion;

    private String autoTaskCompletionEventUUId;

    private String entityUUId;

    private String createdByUuid;

    private String createdByFirstName;

    private String createdByLastName;

    private String createdByUserType;

    private String updatedByUuid;

    private String updatedByFirstName;

    private String updatedByLastName;

    private String updatedByUserType;

    protected Date createdAt;

    protected Date updatedAt;
}
