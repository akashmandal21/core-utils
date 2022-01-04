package com.stanzaliving.generictaskservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@ToString
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class TaskCategoryDto extends AbstractDto {

    private String parentTaskCategoryName;

    private String parentTaskCategoryUuid;

    @NotBlank(message = "Task category name is mandatory.")
    private String taskCategoryName;

    @NotBlank(message = "Module is Mandatory.")
    private String module;

    private List<TaskCategoryDto> taskSubCategoryList;

    private String description;

    private List<String> tagsList ;
}
