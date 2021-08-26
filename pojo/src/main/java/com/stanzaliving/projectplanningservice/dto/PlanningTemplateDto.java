package com.stanzaliving.projectplanningservice.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.projectplanningservice.dto.helper.CustomDateDeserializer;
import com.stanzaliving.projectplanningservice.dto.helper.CustomDateSerializer;
import com.stanzaliving.projectplanningservice.enums.Duration;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

/**
 * @author Pradeep Naik R
 * @description DTO for Project Plan Template
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PlanningTemplateDto extends AbstractDto {

    @NotBlank(message = "Project Plan name is required")
    private String templateName;

    private String description;

    private List<String> taskServiceUuids;

    private PlanningStatus planningStatus;

    private Duration durationDays;

    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using= CustomDateSerializer.class)
    protected Date createdAt;

    @JsonDeserialize(using = CustomDateDeserializer.class)
    @JsonSerialize(using= CustomDateSerializer.class)
    protected Date updatedAt;

    private List<SectionDetailsDto> sectionDetails;
}
