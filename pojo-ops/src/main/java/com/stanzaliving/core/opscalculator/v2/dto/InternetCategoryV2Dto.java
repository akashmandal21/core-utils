package com.stanzaliving.core.opscalculator.V2.dto;

import java.util.List;

import com.stanzaliving.core.opscalculator.dto.CategoryDto;
import com.stanzaliving.core.opscalculator.dto.SMLevelInternetCategoryDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class InternetCategoryV2Dto extends CategoryDto {
    private double internetPlanRate;           //servicemix -> planId  -> com.stanzaliving.core.internet.client.api.InternetClientApi#listPlans
    private double MGOccupancyPercent;      //servicemix -> planId  -> com.stanzaliving.core.internet.client.api.InternetClientApi#listPlans

    private int internetCharges;

    List<SMLevelInternetCategoryDto> smLevelInternetCategoryDtoList;

    @Builder.Default
    private String infoMessage = "Details have been automatically picked from the service mix version.";
}
