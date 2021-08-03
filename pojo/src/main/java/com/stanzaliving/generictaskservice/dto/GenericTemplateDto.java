package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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

    @NotBlank(message = "Type cannot be empty")
    private String type;

    private String priority;

    private boolean isOverridable;

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

}

