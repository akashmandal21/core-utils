package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.projectplanningservice.enums.Duration;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

/**
 * @author Pradeep Naik R
 * @description DTO for Property Plan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PlanningTemplateDto extends AbstractDto {

    @NotBlank(message = "Project Plan name is required")
    private String templateName;

    private String createdByName;

    private String updatedByName;

    private String description;

    private List<String> taskServiceUuids;

    private PlanningStatus planningStatus;

    private int duration;

    private Duration durationUnit;

    protected Date createdAt;

    protected Date updatedAt;

    @Valid
    private List<SectionDetailsDto> sections;
}
