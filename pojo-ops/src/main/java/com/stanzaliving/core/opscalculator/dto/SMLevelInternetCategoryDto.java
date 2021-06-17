package com.stanzaliving.core.opscalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SMLevelInternetCategoryDto {
    private double internetPlanRate;           //servicemix -> planId  -> com.stanzaliving.core.internet.client.api.InternetClientApi#listPlans
    private double MGOccupancyPercent;      //servicemix -> planId  -> com.stanzaliving.core.internet.client.api.InternetClientApi#listPlans
}
