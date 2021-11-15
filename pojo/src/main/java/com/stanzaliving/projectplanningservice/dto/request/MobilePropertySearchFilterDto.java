package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.core.base.common.dto.PaginationRequest;
import com.stanzaliving.projectplanningservice.enums.PlanningStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

/**
 * @author Anudeep Alevoor
 * @description DTO for Property plan Search Filter Parameters
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class MobilePropertySearchFilterDto {

    private List<PlanningStatus> planningStatusList;

    private Date startDate;

    private Date endDate;

    private List<String> microMarketsList;

    private List<String> cityList;

    private List<String> propertyBrand;

    private List<String> propertyType;

    private String orderByColumnName;

    private String orderBy;

}
