package com.stanzaliving.generictaskservice.dto.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.generictaskservice.dto.TaskCategoryDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.time.LocalTime;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class TaskCategoryResponseDto extends AbstractDto {

    private String parentTaskCategoryUuid;

    @NotBlank(message = "Task category name is Mandatory.")
    private String taskCategoryName;

    @NotBlank(message = "Module is Mandatory.")
    private String module;

    private List<TaskCategoryDto> taskSubCategoryList;
    private String description;
    private boolean autoCompleteTask;
    private boolean overLapTask;
    private boolean overrideTask;
    private LocalTime startTime;
    private String autoCompletionEvent;
    private List<TagsGenericResponseDto> tags;
    @JsonIgnore
    private List<String> tagsUuids;

}
