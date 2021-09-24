package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.projectplanningservice.enums.Duration;
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

    private String parentUuid;

    private String sectionName;

    private int duration;

    private Duration durationUnit;

    private String owner;

    @Valid
    private ModuleDto module;

    private List<String> taskServiceUuIds;

    private PlanningStatus sectionStatus;

    @Valid
    private ActivitiesDto activity;

    private List<String> predecessorTasks;

    protected Date createdAt;

    protected Date updatedAt;

    private String propertyUuid;

    private List<SectionDetailsDto> subTasks;

}
