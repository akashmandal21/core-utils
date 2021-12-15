package com.stanzaliving.generictaskservice.dto.response;

import com.stanzaliving.generictaskservice.dto.StatusDto;
import com.stanzaliving.generictaskservice.dto.TaskCategoryDto;
import com.stanzaliving.taskservice.enums.TaskType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

/**
 * @author Vikas S T
 * @date 29-Nov-21
 **/

@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class GenericTaskBeatPlanResponseDto {
    private String uuid;
    private Date startDate;
    private Date dueDate;
    private String taskName;
    private TaskType type;
    private boolean overridable;
    private String duration;
    private String attributeType;
    private List<Object> residences;
    private TaskCategoryDto taskCategoryDto;
    private TaskCategoryDto taskSubCategoryDto;
    private StatusDto taskStatusDto;
    private StatusDto taskSubStatusDto;
    private GenericTaskTemplateResponseDto taskTemplateResponseDto;
}
