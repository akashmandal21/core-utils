package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.generictaskservice.dto.response.TagsGenericResponseDto;
import com.stanzaliving.taskservice.enums.TaskType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
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
public class GenericTemplateDto extends AbstractDto {

    private boolean taskTemplate;
    @NotBlank(message = "Module cannot be empty")
    private String module;
    private boolean overridable;

    @NotBlank(message = "Name cannot be empty")
    private String templateName;

    private String description;

    private TaskType type;

    private String entityUuid;

    private String entityType;

    private boolean autoTaskCompletion;

    private boolean overLap;

    private List<TagsGenericResponseDto> tags;

    private List<String> tagsUuids;

    private String autoTaskCompletionEventUuid;
    @NotBlank(message = "categoryId cannot be empty")
    private String templateCategoryUuid;

    @NotBlank(message = "subCategoryId cannot be empty")
    private String templateSubCategoryUuid;

    private Department department;

    private List<String> commentsUuidList;



}

