package com.stanzaliving.projectplanningservice.dto.request;

import com.stanzaliving.core.enums.PropertyEntityType;
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

    private List<String> residenceStatus;

    private Date startDate;

    private Date endDate;

    private List<String> microMarketsList;

    private List<String> cityList;

    private List<String> propertyBrands;

    private List<PropertyEntityType> propertyTypes;

    private String orderByColumnName;

    private String orderBy;

}
