package com.stanzaliving.core.opscalculator.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InternetCategoryDto extends CategoryDto {
    private int internetPlanRate;
    private double MGOccupancyPercent;

    private int internetCharges;
    private int cleaningSuppliesCharges;

    @Builder.Default
    private String infoMessage = "Details have been automatically picked from the service mix version.";
}
