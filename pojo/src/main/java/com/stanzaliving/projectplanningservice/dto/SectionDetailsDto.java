package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

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

    private int durationDays;

    private String owner;

    private String modules;

    private List<String> taskServiceUuIds;

    private PlanningStatus sectionStatus;

    private String activities;

    private String predecessorTasks;

    protected Date createdAt;

    protected Date updatedAt;

    private List<SectionDetailsDto> subTasks;

}
