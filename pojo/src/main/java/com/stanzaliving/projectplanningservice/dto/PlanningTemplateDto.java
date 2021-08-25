package com.stanzaliving.projectplanningservice.dto;

import com.stanzaliving.projectplanningservice.enums.Duration;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
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
public class PPPlanningTemplateDto implements Serializable {

    private static final long serialVersionUID = 1635296868115644218L;

    private String uuid;

    @NotBlank(message = "Project Plan name is required")
    private String templateName;

    private String description;

    private List<String> taskServiceUuids;

    private String statusUuid;

    private Duration durationDays;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

    private Boolean status;

    private List<PPSectionDetailsDto> ppSectionDetails;


}
