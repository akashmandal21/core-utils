package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * @author Pradeep Naik R
 * @description DTO for Section Details
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PPSectionDetailsDto extends AbstractDto {

    private String uuid;

    private String ppPlanningTemplateUuid;

    private String sectionName;

    private int durationDays;

    private String owner;

    private String modules;

    private List<String> taskServiceUuIds;

    private String statusUuid;

    private String activities;

    private String predecessorTasks;

    private List<PPSectionDetailsDto> subTasks;
}
