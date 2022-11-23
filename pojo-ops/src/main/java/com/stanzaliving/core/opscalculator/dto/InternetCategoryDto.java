package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class InternetCategoryDto extends CategoryDto {
    private double internetPlanRate;           //servicemix -> planId  -> com.stanzaliving.core.internet.client.api.InternetClientApi#listPlans
    private double MGOccupancyPercent;      //servicemix -> planId  -> com.stanzaliving.core.internet.client.api.InternetClientApi#listPlans

    private int internetCharges;

    List<SMLevelInternetCategoryDto> smLevelInternetCategoryDtoList;

    @Builder.Default
    private String infoMessage = "Details have been automatically picked from the service mix version.";
}
