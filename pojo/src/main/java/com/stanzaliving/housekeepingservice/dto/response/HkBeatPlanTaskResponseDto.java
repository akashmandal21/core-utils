package com.stanzaliving.housekeepingservice.dto.response;

import com.stanzaliving.generictaskservice.dto.ResidenceDto;
import com.stanzaliving.generictaskservice.dto.StatusDto;
import com.stanzaliving.generictaskservice.dto.TaskCategoryDto;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Vikas S T
 * @date 30-Sep-21
 **/

@Getter
@Setter
@AllArgsConstructor
@SuperBuilder
@ToString
@NoArgsConstructor
public class HkBeatPlanTaskResponseDto {
    private String uuid;
    private String taskName;
    private String priority;
    private String description;
    private String entityType;
    private String department;
    private String beatPersonUuid;
    private String person;
    private LocalDate day;
    private String location;
    private String beatPlanUuid;
    private LocalDateTime startDate;
    private LocalDateTime dueDate;
    private HkBeatPlanTaskStatusResponseDto status;
    private TaskCategoryDto taskCategoryDto;
    private TaskCategoryDto taskSubCategoryDto;
    private StatusDto taskStatusDto;
    private StatusDto taskSubStatusDto;
    private List<ResidenceDto> residenceDtos;
    private HkPseudoPersonResponseDto pseudoPerson;

}
