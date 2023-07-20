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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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

    @Size(min = 3, max = 100, message = "Characters should be minimum from 3 to maximum 100")
    @NotBlank(message = "Project Plan name is required")
    private String projectName;

    @Size(max = 40, message = "Max allowed characters up to 40")
    @NotBlank(message = "Template uuid is required")
    private String templateUuid;

    @NotNull(message = "Start Date is required")
    private Date startDate;

    @NotNull(message = "End Date is required")
    private Date endDate;

    @Size(max = 40, message = "Max allowed characters up to 40")
    @NotBlank(message = "Residence uuid is required")
    private String residenceUuid;

    @Valid
    private List<SectionDetailsDto> sections;

    @Size(max = 100, message = "Max allowed characters up to 100")
    private String propertyName;

    @Size(max = 40, message = "Max allowed characters up to 40")
    private String microMarket;

    @Size(max = 40, message = "Max allowed characters up to 40")
    private String city;

    private Integer bedCount;

    private Integer progress;

    @Required(message = "Planning status is required")
    private PlanningStatus planningStatus;

    private Integer hiddenTasksCount;

    private String liveParentPlanId;
}
