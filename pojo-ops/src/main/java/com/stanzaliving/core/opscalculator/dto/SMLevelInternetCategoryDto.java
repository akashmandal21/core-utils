package com.stanzaliving.core.opscalculator.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SMLevelInternetCategoryDto {
    private double internetPlanRate;           //servicemix -> planId  -> com.stanzaliving.core.internet.client.api.InternetClientApi#listPlans
    private double MGOccupancyPercent;      //servicemix -> planId  -> com.stanzaliving.core.internet.client.api.InternetClientApi#listPlans
}
