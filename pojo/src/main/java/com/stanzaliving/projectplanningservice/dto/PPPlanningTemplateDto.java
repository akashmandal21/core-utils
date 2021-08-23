package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.projectplanningservice.enums.Duration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author Pradeep Naik R
 * @description DTO for Project Plan Template
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PPPlanningTemplateDto extends AbstractDto {

    private String uuid;

    @NotBlank(message = "Project Plan name is required")
    private String templateName;

    private String description;

    private List<String> taskServiceUuids;

    private String statusUuid;

    private Duration durationDays;

    private List<PPSectionDetailsDto> ppSectionDetails;
}
