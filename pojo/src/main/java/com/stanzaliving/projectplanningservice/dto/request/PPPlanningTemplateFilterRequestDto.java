package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.core.base.common.dto.DateTimeRangeDto;
import com.stanzaliving.core.base.common.dto.PaginationRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Pradeep Naik R
 * @description DTO for Template Search Filter Parameters
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PPPlanningTemplateFilterRequestDto {

    private String ppPlanningTemplateName;

    private String addedBy;

    private DateTimeRangeDto addedBetween;

    private String status;

    private PaginationRequest pageRequest;
}