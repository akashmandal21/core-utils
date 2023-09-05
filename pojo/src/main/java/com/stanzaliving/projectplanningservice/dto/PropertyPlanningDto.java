package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.core.base.common.dto.AbstractDto;
import com.stanzaliving.core.enums.PropertyEntityType;
import com.stanzaliving.projectplanningservice.enums.Duration;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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

    @NotBlank(message = "Uuid is required")
    protected String uuid;

    @NotBlank(message = "Project Plan name is required")
    private String projectName;

    @NotBlank(message = "Template uuid is required")
    private String templateUuid;

    private String templateName;

    private long tasks;

    private Date startDate;

    private Date endDate;

    private String createdByName;

    private String updatedByName;

    @NotBlank(message = "Residence uuid is required")
    private String residenceUuid;

    private List<String> taskServiceUuids;

    private List<String> tasksUuids;

    private List<SectionDetailsDto> sections;

    private String propertyName;

    private String microMarket;

    private String city;

    private Integer bedCount;

    private Integer progress;

    @NotNull
    private PlanningStatus planningStatus;

    private Integer duration;

    private Duration durationUnit;

    /* Additional Property [ Residence ] Data from Stanza Residence API */
    private Double residenceLatitude;

    private Double residenceLongitude;

    private String residenceName;

    private String residenceStatus;

    private String residenceBrandName;

    private String residenceSubBrandName;

    private PropertyEntityType residencePropertyType;

    private String residenceThumbnailUrl;

    private Date llHODate;

    private Date opsHODate;

    private Integer hiddenTasksCount;

    private String liveParentPlanId;

    private Boolean isEditable;
}
