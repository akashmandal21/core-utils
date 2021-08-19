package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.taskservice.enums.TaskType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
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
public class GenericTemplateDto extends AbstractDto {

    private boolean taskTemplate;

    @NotBlank(message = "Module cannot be empty")
    private String module;

    private Date startDate;

    private Date dueDate;

    private String taskOwner;

    private TaskType type;

    private String priority;

    private boolean overridable;

    @NotBlank(message = "Name cannot be empty")
    private String templateName;

    private String description;

    private String entityUUId;

    private String entityType;

    private String var1;

    private String var2;

    private String var3;

    private String var4;

    private String templateStatusUUId;

    private String templateSubStatusUUId;

    private boolean autoTaskCompletion;

    private String autoTaskCompletionEventUUId;

    private String parentTaskUUId;

    @NotBlank(message = "categoryId cannot be empty")
    private String categoryUUId;

    @NotBlank(message = "subCategoryId cannot be empty")
    private String subCategoryUUId;

    private List<String> attachmentsList;

    private List<String> dependentTaskUUIdList;

    private List<String> tagsUUIdList;

    private List<String> commentsUUIdList ;

}

