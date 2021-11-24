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
import javax.validation.constraints.Size;
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

    @Size(min = 3, max = 100, message = "Characters should be minimum from 3 to maximum 100")
    @NotBlank(message = "Template name is required")
    private String templateName;

    @Size(max = 100, message = "Max allowed characters up to 100")
    private String description;

    @NotNull
    private PlanningStatus planningStatus;

    private int duration;

    @NotNull
    private Duration durationUnit;

    @Valid
    private List<SectionDetailsDto> sections;
}
