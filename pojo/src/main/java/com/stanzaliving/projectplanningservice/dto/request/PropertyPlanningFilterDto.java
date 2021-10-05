package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * @author Anudeep Alevoor
 * @description DTO for Property plan Search Filter Parameters
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class PropertyPlanningFilterDto {

    private String propertyName;

    private String microMarket;

    private String city;

    private Integer bedCount;

    private String projectName;

    private Integer days;

    private Integer progress;

    private PlanningStatus planningStatus;

    private String orderByColumnName;

    private String orderBy;

    private PaginationRequest pageRequest;
}
