package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.generictaskservice.dto.TaskCategoryDto;
import com.stanzaliving.generictaskservice.dto.request.TaskCategoryTypeDetailsRequestDto;
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
public class TaskCategoryResponseDto extends AbstractDto {

    private String parentTaskCategoryUuid;

    @NotBlank(message = "Task category name is Mandatory.")
    private String taskCategoryName;

    @NotBlank(message = "Module is Mandatory.")
    private String module;

    private List<TaskCategoryDto> taskSubCategoryList;

    private String taskType;

    private TaskCategoryTypeDetailsResponseDto taskCategoryTypeDetailsResponseDto;
}
