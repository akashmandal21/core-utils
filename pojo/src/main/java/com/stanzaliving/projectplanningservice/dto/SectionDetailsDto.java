package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.projectplanningservice.enums.Duration;
import com.stanzaliving.generictaskservice.dto.GenericTaskDto;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * @author Pradeep Naik R
 * @description DTO for Section Details
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class SectionDetailsDto extends AbstractDto {

    private String taskServiceUuid;

    private String parentTemplateUuid;

    private int duration;

    private Duration durationUnit;

    private List<String> taskChildUuids;

    private PlanningStatus sectionStatus;

    private String activityUuid;

    private List<String> predecessorTasks;

    protected Date createdAt;

    protected Date updatedAt;

    @Valid
    private GenericTaskDto task;

    private List<SectionDetailsDto> tasks;

}
