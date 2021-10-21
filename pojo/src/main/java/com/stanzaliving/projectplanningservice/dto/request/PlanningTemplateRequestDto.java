package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.projectplanningservice.dto.SectionDetailsDto;
import com.stanzaliving.projectplanningservice.enums.Duration;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Pradeep Naik R
 * @description DTO for Property Plan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PlanningTemplateRequestDto {

    @NotBlank(message = "Project Plan name is required")
    private String templateName;

    private String description;
    
    @NotNull
    private PlanningStatus planningStatus;

    private int duration;

    @NotNull
    private Duration durationUnit;

    @Valid
    private List<SectionDetailsDto> sections;
}
