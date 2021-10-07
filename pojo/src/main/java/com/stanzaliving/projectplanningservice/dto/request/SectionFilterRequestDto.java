package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
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

    @NotBlank(message = "Template ID is required")
    private String templateUuid;

    private String durationUnit;

    private int minDaysRange;

    private int maxDaysRange;

    private List<String> module;

    private PaginationRequest pageRequest;

    private List<String> owners;

    private List<String> activityList;

    private List<String> predecessorTasks;

    private List<String> taskUuids;

    private boolean taskTemplate;

    private String orderBy;

    private String orderByColumnName;
}