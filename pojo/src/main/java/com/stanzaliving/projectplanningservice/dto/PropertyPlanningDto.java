package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
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
public class PropertyPlanningDto extends AbstractDto {

    @NotBlank(message = "Project Plan name is required")
    private String projectName;

    private String templateUuid;

    private Date startDate;

    private Date endDate;

    private String residenceUuid;

    private List<String> tasksUuids;

    private List<SectionDetailsDto> sections;
}
