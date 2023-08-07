package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

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

    private List<String> microMarketList;

    private Integer bedCount;

    private String projectName;

    private Integer days;

    private Integer progress;

    private List<PlanningStatus> planningStatusList;

    private String orderByColumnName;

    private String orderBy;

    private PaginationRequest pageRequest;

    private List<String> cityList;
}
