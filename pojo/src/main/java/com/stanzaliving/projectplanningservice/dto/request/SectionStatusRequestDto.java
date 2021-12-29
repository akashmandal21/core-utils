package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.core.base.enums.Department;
import com.stanzaliving.generictaskservice.dto.DelayDto;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @author Pradeep Naik R
 * @description DTO for Section Details
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class SectionStatusRequestDto {

    @NotBlank(message = "Uuid is required")
    private String uuid;

    /*
     Status of the task
     */
    @NotBlank(message = "Task status uuid is required")
    private String taskStatusUuid;

    private Date actualStartDate;

    private Date actualDueDate;

    private DelayDto delayDto;

    private Department department;

    private String propertyUuid;

    private PlanningStatus planningStatus;
}
