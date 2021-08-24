package com.stanzaliving.projectplanningservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Pradeep Naik R
 * @description DTO for Section Details
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PPSectionDetailsDto implements Serializable {

    private static final long serialVersionUID = 1635296868115644218L;

    private String uuid;

    private String ppPlanningTemplateUuid;

    private String sectionName;

    private int durationDays;

    private String owner;

    private String modules;

    private List<String> taskServiceUuIds;

    private String statusUuid;

    private String activities;

    private String predecessorTasks;

    private Date createdAt;

    private String createdBy;

    private Date updatedAt;

    private String updatedBy;

    private Boolean status;

    private List<PPSectionDetailsDto> subTasks;

}
