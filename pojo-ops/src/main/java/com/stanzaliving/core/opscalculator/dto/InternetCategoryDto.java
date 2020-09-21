package com.stanzaliving.core.opscalculator.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class InternetCategoryDto extends CategoryDto {
    private double internetPlanRate;           //servicemix -> planId  -> com.stanzaliving.core.internet.client.api.InternetClientApi#listPlans
    private double MGOccupancyPercent;      //servicemix -> planId  -> com.stanzaliving.core.internet.client.api.InternetClientApi#listPlans

    private int internetCharges;

    @Builder.Default
    private String infoMessage = "Details have been automatically picked from the service mix version.";
}
