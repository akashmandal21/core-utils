package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.projectplanningservice.dto.SectionDetailsDto;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

/**
 * @author Pradeep Naik R
 * @description Request DTO for Property Plan
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PropertyPlanningRequestDto {

    @NotBlank(message = "Project Plan name is required")
    private String projectName;

    @NotBlank(message = "Template uuid is required")
    private String templateUuid;

    private Date startDate;

    private Date endDate;

    @NotBlank(message = "Residence uuid is required")
    private String residenceUuid;

    @Valid
    private List<SectionDetailsDto> sections;

    private String propertyName;

    private String microMarket;

    private String city;

    private Integer bedCount;

    private Integer progress;

    @Required(message = "Planning status is required")
    private PlanningStatus planningStatus;
}
