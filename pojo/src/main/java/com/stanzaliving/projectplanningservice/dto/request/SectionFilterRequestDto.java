package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.projectplanningservice.enums.Duration;
import com.stanzaliving.projectplanningservice.enums.TaskOwnerTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;


/**
 * @author Pradeep Naik R
 * @description DTO for Template Search Filter Parameters
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class SectionFilterRequestDto {

    /*
    While clearing the filters to get the state back use this
     */
    @NotBlank(message = "Template ID is required")
    private String templateUuid;

    /*
    For deciding whether filter is applied or not for BE
     */
    private boolean clearFilterFlag;

    private Duration durationUnit;

    private Integer minDaysRange;

    private Integer maxDaysRange;

    private List<String> modules;

    private PaginationRequest pageRequest;

    private List<String> owners;

    private List<String> activityList;

    private List<String> predecessorTasks;

    private TaskOwnerTypeEnum taskOwnerType;

    private List<String> taskUuids;

    private Boolean taskTemplate;

    private String orderBy;

    private String orderByColumnName;

    private Date plannedStartDate;

    private Date plannedDueDate;

    private Date actualStartDate;

    private Date actualDueDate;

    private List<Integer> completionStatusList;
}